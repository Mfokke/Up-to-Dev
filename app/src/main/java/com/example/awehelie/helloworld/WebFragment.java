package com.example.awehelie.helloworld;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Marcel Fokke on 27-5-2016.
 */
public class WebFragment extends Fragment {

    View rootView;
    public WebFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.web_fragment, container, false);

        WebView myWebView = (WebView) rootView.findViewById(R.id.nav_Web);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://thenextweb.com/");


        return rootView;

    }



}


