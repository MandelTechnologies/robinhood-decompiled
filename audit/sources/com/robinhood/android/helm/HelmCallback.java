package com.robinhood.android.helm;

import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: HelmCallback.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/helm/HelmCallback;", "", "startNativeSubFlow", "", "flowId", "", "subFlowId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopLoadingSubFlow", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endFlow", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchUi", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "lib-helm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface HelmCallback {
    Object endFlow(Continuation<? super Unit> continuation);

    void launchUi(FragmentKey fragmentKey);

    Object startNativeSubFlow(String str, String str2, Continuation<? super Boolean> continuation);

    Object stopLoadingSubFlow(String str, Continuation<? super Unit> continuation);
}
