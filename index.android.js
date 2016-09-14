'use strict';
import React, { Component } from 'react';

import {
  AppRegistry,
  TouchableHighlight,
	StyleSheet,
	Text,
  View
	} from 'react-native';

import AndroidToast from './AndroidToast';
import PicView from './PicView';

class HelloWorld extends Component{
    render() {
      let picSrc = {
      uri: 'https://upload.wikimedia.org/wikipedia/commons/d/de/Bananavarieties.jpg'
    };
	  return (
		<View style={styles.container}>
		<Text style={styles.hello}>Hello, World</Text>
    <TouchableHighlight onPress = {() => {
      AndroidToast.showMsg('Toast from RN',AndroidToast.SHORT);
    }}>
       <Text style = {styles.hello}>Touch it </Text>
    </TouchableHighlight>
    <PicView src = { [picSrc] } style = {styles.mainPic} resizeMode = {'contain'}/>
    </View>
		)}
}
var styles = StyleSheet.create({
	container: {
	    flex: 1,
	    justifyContent: 'center',
	},
	hello: {
	    fontSize: 20,
	    textAlign: 'center',
	    margin: 10,
	},
  mainPic: {
    width: 193,
    height: 110,
  },
});

AppRegistry.registerComponent('HelloWorld', () => HelloWorld);
