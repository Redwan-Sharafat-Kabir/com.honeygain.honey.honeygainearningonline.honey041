package com.honeygaincash.honeygaincase041;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class honeygaincase041_UnifiedWebViewFragment2 extends Fragment {
    private WebView webView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.honeygaincase041_fragment_webview, container, false);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String customUrl = sharedPreferences.getString("data1", "");
        String customUrl1 = sharedPreferences.getString("data4", "");

        String urlToLoad = ""; // Initialize with a default value
        String[] tagsForCustomUrl = {"fragmentTag1","fragmentTag2","fragmentTag3","fragmentTag4","fragmentTag5","fragmentTag6","fragmentTag7","fragmentTag8","fragmentTag9","fragmentTag10","fragmentTag11","fragmentTag12","fragmentTag13","fragmentTag14","fragmentTag15"};

        String[] tagsForCustomUrl1 = {"fragmentTag31","fragmentTag32","fragmentTag33","fragmentTag34","fragmentTag35","fragmentTag36","fragmentTag37","fragmentTag38","fragmentTag39","fragmentTag40","fragmentTag41","fragmentTag42","fragmentTag43","fragmentTag44","fragmentTag45"};

        if (customUrl != null && !customUrl.isEmpty() && isInArray(getTag(), tagsForCustomUrl)) {
            urlToLoad = customUrl;
        } else if (customUrl1 != null && !customUrl1.isEmpty() && isInArray(getTag(), tagsForCustomUrl1)) {
            urlToLoad = customUrl1;
        }

        webView = view.findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);

        if (!urlToLoad.isEmpty()) {
            webView.loadUrl(urlToLoad);
        }

        return view;
    }

    private boolean isInArray(String value, String[] array) {
        for (String item : array) {
            if (item.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
