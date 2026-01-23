package com.robinhood.android.eventcontracts.contracts;

import android.net.Uri;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey2;
import com.robinhood.shared.common.contracts.MicrogramRouterTabFragmentKey;
import kotlin.Metadata;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: EventContractsHubDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"constructEcHubFragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "entryPoint", "", "contracts_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.contracts.EventContractsHubDeeplinkTargetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventContractsHubDeeplinkTarget2 {
    public static final FragmentKey constructEcHubFragmentKey(String str) {
        return new MicrogramRouterTabFragmentKey(new RemoteMicrogramApplication("app-events-contract-hub", null, 2, null), new Uri.Builder().scheme("robinhood").authority("hub").appendQueryParameter("source", str).build().toString(), null, MicrogramRouterFragmentKey2.EMPTY, null, null, 52, null);
    }
}
