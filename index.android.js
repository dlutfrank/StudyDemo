'use strict';
import React, { Component } from 'react';
// import React from 'react';
import AndroidToast from './AndroidToast'
import {
  AppRegistry,
  TouchableHighlight,
	StyleSheet,
	Text,
  View
	} from 'react-native';

// class HelloWorld extends React.Component {
class HelloWorld extends Component{
    render() {
    // AndroidToast.showMsg('Toast from RN', AndroidToast.SHORT);
	  return (
		<View style={styles.container}>
		<Text style={styles.hello}>Hello, World</Text>
    <TouchableHighlight onPress = {() => {
      AndroidToast.showMsg('Toast from RN',AndroidToast.SHORT);
    }}>
       <Text style = {styles.hello}>Touch it </Text>
    </TouchableHighlight>
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
    });

AppRegistry.registerComponent('HelloWorld', () => HelloWorld);
