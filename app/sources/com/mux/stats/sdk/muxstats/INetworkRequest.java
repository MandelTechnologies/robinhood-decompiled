package com.mux.stats.sdk.muxstats;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/* loaded from: classes27.dex */
public interface INetworkRequest {

    @Deprecated
    public interface IMuxNetworkRequestsCompletion {
        void onComplete(boolean z);
    }

    public interface IMuxNetworkRequestsCompletion2 {
        void onComplete(boolean z, Map<String, List<String>> map);
    }

    default void postWithCompletion(String str, String str2, String str3, Hashtable<String, String> hashtable, final IMuxNetworkRequestsCompletion2 iMuxNetworkRequestsCompletion2) {
        postWithCompletion(str, str2, str3, hashtable, new IMuxNetworkRequestsCompletion() { // from class: com.mux.stats.sdk.muxstats.INetworkRequest$$ExternalSyntheticLambda0
            @Override // com.mux.stats.sdk.muxstats.INetworkRequest.IMuxNetworkRequestsCompletion
            public final void onComplete(boolean z) {
                iMuxNetworkRequestsCompletion2.onComplete(z, null);
            }
        });
    }

    void postWithCompletion(String str, String str2, String str3, Hashtable<String, String> hashtable, IMuxNetworkRequestsCompletion iMuxNetworkRequestsCompletion);
}
