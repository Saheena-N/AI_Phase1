7321-Nandha College of Technology

AI_Phase1_Eathquake_Prediction_Model_Using_Python
Project By
SAHEENA N
_____________________________________________________

from numpy.lib.arraysetops import unique
import numpy as np
import pandas as pd
from sklearn.preprocessing import StandardScaler
from sklearn.model_selection import GridSearchCV
from sklearn.linear_model import SGDRegressor
import plotly.graph_objs as gg
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression, LogisticRegression
import seaborn as sns
import matplotlib.pyplot as plt
%matplotlib inline
from sklearn.ensemble import RandomForestRegressor, GradientBoostingRegressor
from lightgbm import LGBMRegressor
from xgboost.sklearn import XGBRegressor
from sklearn.multioutput import MultiOutputRegressor
import warnings
from sklearn.metrics import mean_squared_error
import matplotlib.pyplot as plot
import seaborn as sns

# Importing dataset and examining it
dataset = pd.read_csv("Earthquake_dataset.csv")
pd.set_option('display.max_columns', None) # to make sure you can see all the columns in output window
print(dataset.head())
print(dataset.shape)
print(dataset.info())
print(dataset.describe())

# creating our subplot
plt.subplots(figsize=(10, 5))
sns.histplot(x='mag', data=dataset)
plt.show()
plt.subplots(figsize=(10, 5))
sns.histplot(x='nst', data=dataset)
plt.show()
plt.subplots(figsize=(10, 5))
sns.histplot(x='rms', data=dataset)
plt.show()
plt.subplots(figsize=(10, 5))
sns.histplot(x='depth', data=dataset)
plt.show()
plt.subplots(figsize=(10, 5))
sns.histplot(x='gap', data=dataset)
plt.show()

# initialize figure with 3 subplots in a row
fig, ax = plt.subplots(1, 3, figsize=(10, 6))

# add padding between the subplots
plt.subplots_adjust(wspace=0.5) 

# draw boxplot for nst in the 1st subplot
sns.boxplot(data=dataset['nst'], ax=ax[0], color='brown',)
ax[0].set_xlabel('nst')

# draw boxplot for gap in the 2nd subplot
sns.boxplot(data=dataset['gap'], ax=ax[1], color='g')
ax[1].set_xlabel('gap')

# draw boxplot for rms in the 3rd subplot
sns.boxplot(data=dataset['rms'], ax=ax[2], color='y')
ax[2].set_xlabel('rms')


# by default, you'll see x-tick label set to 0 in each subplot
# remove it by setting it to empty list
for subplot in ax:
    subplot.set_xticklabels([])
    
plt.show()

dataset['nst'].replace({"":np.nan}, inplace=True)
dataset['nst'].fillna(dataset['nst'].mode().iloc[0], inplace=True)

dataset['gap'].replace({"":np.nan}, inplace=True)
dataset['gap'].fillna(dataset['gap'].mode().iloc[0], inplace=True)

dataset['rms'].replace({"":np.nan}, inplace=True)
dataset['rms'].fillna(dataset['rms'].mode().iloc[0], inplace=True)

import re
lst = []
for i in dataset['place']:
  new = re.sub('^(.*of )',"", i)
  lst.append(new)

set1 = set(lst)
dataset['place'] = lst

df = pd.get_dummies(dataset, columns = ['place'])

X = df.drop(['time','latitude','longitude','mag','magType','dmin','net','id','updated','type','horizontalError','depthError','magError','magNst','status','locationSource','magSource'], axis = 1) 
y= df[['mag']]

# Train test splitting
X_data, X_test, y_data, y_test = train_test_split(X, y,test_size=0.2,random_state=13)

# Creating a validation set
X_train, X_val, y_train, y_val = train_test_split(X_data, y_data,test_size=0.2,random_state=13)


