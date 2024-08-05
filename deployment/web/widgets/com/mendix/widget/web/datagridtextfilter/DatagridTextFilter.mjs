import{useState as e,useCallback as t,useEffect as n,useRef as l,createElement as a,useMemo as r,memo as i,Children as o}from"react";import{or as u,attribute as s,literal as c,contains as d,startsWith as p,endsWith as v,greaterThan as f,greaterThanOrEqual as m,equals as y,notEqual as b,lessThan as h,lessThanOrEqual as g}from"mendix/filters/builders";var w,C={exports:{}};
/*!
	Copyright (c) 2018 Jed Watson.
	Licensed under the MIT License (MIT), see
	http://jedwatson.github.io/classnames
*/w=C,function(){var e={}.hasOwnProperty;function t(){for(var n=[],l=0;l<arguments.length;l++){var a=arguments[l];if(a){var r=typeof a;if("string"===r||"number"===r)n.push(a);else if(Array.isArray(a)){if(a.length){var i=t.apply(null,a);i&&n.push(i)}}else if("object"===r){if(a.toString!==Object.prototype.toString&&!a.toString.toString().includes("[native code]")){n.push(a.toString());continue}for(var o in a)e.call(a,o)&&a[o]&&n.push(o)}}}return n.join(" ")}w.exports?(t.default=t,w.exports=t):window.classNames=t}();var E=C.exports;function T(l,a){const[r,i]=e(),o=t((()=>{i((e=>{const t=null==l?void 0:l.getBoundingClientRect();return a=t,(n=e)&&a&&n.height===a.height&&n.width===a.width&&n.bottom===a.bottom&&n.top===a.top&&n.left===a.left&&n.right===a.right?e:t;var n,a}))}),[l]);var u;return n((()=>u?function(e){let t;const n=()=>{t=window.requestAnimationFrame((()=>{e(),n()}))},l=()=>window.cancelAnimationFrame(t);return n(),l}(u):void 0),[u=a?o:void 0]),r}function x(r){const i=r.defaultFilter,o=r.onChange,[u,s]=e(i),[c,d]=e(!1),p=l(null),v=l(null);var f,m;n((()=>{const e=e=>{if(Array.isArray(f)){if(f.some((t=>!t.current||t.current.contains(e.target))))return}else if(!f.current||f.current.contains(e.target))return;m()};return document.addEventListener("mousedown",e),document.addEventListener("touchstart",e),()=>{document.removeEventListener("mousedown",e),document.removeEventListener("touchstart",e)}}),[f=[p,v],m=()=>d(!1)]);const y=T(p.current,c),b=t((e=>{s(e),o(e),d(!1)}),[o]);n((()=>{s(i),o(i)}),[i,o]);const h=a("ul",{ref:v,id:"".concat(r.id,"-filter-selectors"),className:"filter-selectors",role:"menu","data-focusindex":0,style:{position:"fixed",top:null==y?void 0:y.bottom,left:null==y?void 0:y.left}},r.options.map(((e,t)=>a("li",{className:E({"filter-selected":u===e.value}),key:t,onClick:t=>{t.preventDefault(),t.stopPropagation(),b(e.value)},onKeyDown:n=>{if("Enter"===n.key||" "===n.key)n.preventDefault(),n.stopPropagation(),b(e.value);else if("Tab"===n.key&&t+1===r.options.length)n.preventDefault(),b(u);else if("Tab"===n.key&&n.shiftKey&&0===t||"Escape"===n.key){var l;n.preventDefault(),null===(l=p.current)||void 0===l||null===(l=l.querySelector("button"))||void 0===l||l.focus(),d(!1)}},role:"menuitem",tabIndex:0},a("div",{className:E("filter-icon",e.value),"aria-hidden":!0}),a("div",{className:"filter-label"},e.label))))),g=t((()=>{d((e=>!e)),setTimeout((()=>{var e;null===(e=v.current)||void 0===e||null===(e=e.querySelector("li.filter-selected"))||void 0===e||e.focus()}),10)}),[]);return a("div",{className:"filter-selector"},a("div",{className:"filter-selector-content",ref:p},a("button",{"aria-controls":"".concat(r.id,"-filter-selectors"),"aria-expanded":c,"aria-haspopup":!0,"aria-label":r.ariaLabel,className:E("btn btn-default filter-selector-button button-icon",u),onClick:g,onKeyDown:e=>{"Enter"!==e.key&&" "!==e.key||(e.preventDefault(),e.stopPropagation(),g())}}," "),c&&h))}const N=(e,t)=>{let n=null;const l=()=>{null!==n&&(clearTimeout(n),n=null)};return[function(){for(var a=arguments.length,r=new Array(a),i=0;i<a;i++)r[i]=arguments[i];l(),n=setTimeout((()=>e(...r)),t)},l]};function S(e,t){return n=>n[e]!==t?{...n,[e]:t}:n}function F(a,r,i){const o=function(e){const a=l(e);return n((()=>{a.current=e})),t((function(){for(var e=arguments.length,t=new Array(e),n=0;n<e;n++)t[n]=arguments[n];return a.current&&a.current.apply(void 0,t)}),[])}(r),[u]=e((()=>N(o,i)[0])),s=l(null),c=l(a);return n((()=>{var e;const{current:t}=c;a.type!==t.type?(o(a.inputValue,a.type),null===(e=s.current)||void 0===e||e.focus()):a.inputValue!==t.inputValue&&u(a.inputValue,a.type),c.current=a}),[a]),[s]}const I=i((function(e){var t;const{current:n}=l(e.initialFilterType);return a("div",{className:E("filter-container",e.className),"data-focusindex":null!==(t=e.tabIndex)&&void 0!==t?t:0,style:e.styles},e.adjustable&&a(x,{ariaLabel:e.screenReaderButtonCaption,id:e.id,defaultFilter:n,onChange:e.onFilterTypeClick,options:[{value:"contains",label:"Contains"},{value:"startsWith",label:"Starts with"},{value:"endsWith",label:"Ends with"},{value:"greater",label:"Greater than"},{value:"greaterEqual",label:"Greater than or equal"},{value:"equal",label:"Equal"},{value:"notEqual",label:"Not equal"},{value:"smaller",label:"Smaller than"},{value:"smallerEqual",label:"Smaller than or equal"},{value:"empty",label:"Empty"},{value:"notEmpty",label:"Not empty"}]}),a("input",{"aria-label":e.screenReaderInputCaption,className:E("form-control",{"filter-input":e.adjustable}),disabled:e.inputDisabled,onChange:e.onInputChange,placeholder:e.placeholder,ref:e.inputRef,type:"text",value:e.inputValue}))}));function k(t){const[l,i,o]=function(t){const[n,l]=e(t),[a,i]=r((()=>[e=>l(S("inputValue",e.target.value)),e=>l(S("type",e))]),[]);return[n,a,i]}((()=>{var e;return{inputValue:null!==(e=t.initialFilterValue)&&void 0!==e?e:"",type:t.initialFilterType}})),[u]=F(l,((e,n)=>{var l;return null===(l=t.updateFilters)||void 0===l?void 0:l.call(t,e,n)}),t.inputChangeDelay);return function(e){n((()=>{var t;void 0!==e.initialFilterValue&&(null===(t=e.updateFilters)||void 0===t||t.call(e,e.initialFilterValue,e.initialFilterType))}),[])}(t),a(I,{initialFilterType:t.initialFilterType,onFilterTypeClick:o,onInputChange:i,inputRef:u,inputValue:l.inputValue,inputDisabled:"empty"===l.type||"notEmpty"===l.type,adjustable:t.adjustable,className:t.className,id:t.id,placeholder:t.placeholder,screenReaderButtonCaption:t.screenReaderButtonCaption,screenReaderInputCaption:t.screenReaderInputCaption,styles:t.styles,tabIndex:t.tabIndex})}const q=e=>{let{className:t,bootstrapStyle:n,children:l,role:r}=e;return o.count(l)>0?a("div",{className:E("alert alert-".concat(n),t),role:r},l):null};var A;q.displayName="Alert",function(e){e.STRING="string",e.NUMBER="number",e.ENUMERATION="enum",e.DATE="date",e.ASSOCIATION="association"}(A||(A={}));const R="com.mendix.widgets.web.filterable.filterContext";function D(e){if(e&&1===e.length){const[t]=e;let n="equal";switch(t.type){case"contains":n="contains";break;case"starts-with":n="startsWith";break;case"ends-with":n="endsWith";break;case">":n="greater";break;case">=":n="greaterEqual";break;case"=":n="equal";break;case"!=":n="notEqual";break;case"<":n="smaller";break;case"<=":n="smallerEqual"}return{type:n,value:String(t.value)}}}function V(e){const t=l("TextFilter".concat(function(){const e="com.mendix.widgets.web.UUID";return window[e]||(window[e]=1),window[e]++}())),n=window[R],r=a(q,{bootstrapStyle:"danger"},"The Text filter widget must be placed inside the header of the Data grid 2.0 or Gallery widget."),i=a(q,{bootstrapStyle:"danger"},'The Text filter widget can\'t be used with the filters options you have selected. It requires a "Hashed string or String" attribute to be selected.');return(null==n?void 0:n.Consumer)?a(n.Consumer,null,(n=>{var l,o,s,c,d,p,v,f;if(!n||!n.filterDispatcher||!n.singleAttribute&&!n.multipleAttributes)return r;const{filterDispatcher:m,singleAttribute:y,multipleAttributes:b,singleInitialFilter:h,multipleInitialFilters:g}=n,w=[...y?[y]:[],...b&&null!==(l=j(b))&&void 0!==l?l:[]];if(0===w.length)return b?i:r;const C=D(h||(null==g?void 0:g[w[0].id])),E=(T=w[0].type)&&!T.match(/HashString|String/)?"The attribute type being used for Text filter is not 'Hashed string or String'":null;var T;return E?a(q,{bootstrapStyle:"danger"},E):"loading"===(null===(o=e.defaultValue)||void 0===o?void 0:o.status)?null:a(k,{adjustable:e.adjustable,className:e.class,initialFilterType:null!==(s=null==C?void 0:C.type)&&void 0!==s?s:e.defaultFilter,initialFilterValue:null!==(c=null==C?void 0:C.value)&&void 0!==c?c:null===(d=e.defaultValue)||void 0===d?void 0:d.value,inputChangeDelay:e.delay,id:t.current,placeholder:null===(p=e.placeholder)||void 0===p?void 0:p.value,screenReaderButtonCaption:null===(v=e.screenReaderButtonCaption)||void 0===v?void 0:v.value,screenReaderInputCaption:null===(f=e.screenReaderInputCaption)||void 0===f?void 0:f.value,styles:e.style,tabIndex:e.tabIndex,updateFilters:(t,n)=>{var l,a;null===(l=e.valueAttribute)||void 0===l||l.setValue(t),null===(a=e.onChange)||void 0===a||a.execute();const r=null==w?void 0:w.map((e=>B(e,t,n))).filter((e=>void 0!==e));m({getFilterCondition:()=>r&&r.length>1?u(...r):null==r?void 0:r[0],filterType:A.STRING})}})})):r}function j(e){if(e)return Object.keys(e).map((t=>e[t])).filter((e=>e.type.match(/HashString|String/)))}function B(e,t,n){if(!e||!e.filterable||"empty"!==n&&"notEmpty"!==n&&!t)return;return{contains:d,startsWith:p,endsWith:v,greater:f,greaterEqual:m,equal:y,notEqual:b,smaller:h,smallerEqual:g,empty:y,notEmpty:b}[n](s(e.id),c("empty"===n||"notEmpty"===n?void 0:t))}export{V as default};