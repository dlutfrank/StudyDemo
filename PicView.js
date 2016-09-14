'use strict'
import { PropTypes } from 'react';
import { requireNativeComponent, View } from 'react-native';

var iface = {
  name: 'PicView',
  propTypes: {
    src: PropTypes.array,
    borderRadius: PropTypes.number,
    resizeMode: PropTypes.oneOf(['cover','contain','stretch']),
    ...View.propTypes,
  },
};

module.exports = requireNativeComponent('RCTPicView',iface);
