package com.robinhood.android.debitcard.linking.p098ui;

import com.robinhood.android.debitcard.linking.p098ui.DebitCardLinkingIntroDuxo;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardLinkingIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroDuxo$DataState;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroDuxo$ViewState;", "<init>", "()V", "reduce", "dataState", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroStateProvider, reason: use source file name */
/* loaded from: classes2.dex */
public final class DebitCardLinkingIntroDuxo2 implements StateProvider<DebitCardLinkingIntroDuxo.DataState, DebitCardLinkingIntroDuxo.ViewState> {
    public static final int $stable = 0;
    public static final DebitCardLinkingIntroDuxo2 INSTANCE = new DebitCardLinkingIntroDuxo2();

    private DebitCardLinkingIntroDuxo2() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public DebitCardLinkingIntroDuxo.ViewState reduce(DebitCardLinkingIntroDuxo.DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ApiDisclosureUIResponse response = dataState.getResponse();
        return new DebitCardLinkingIntroDuxo.ViewState(response != null ? response.getDisclosure_text() : null);
    }
}
