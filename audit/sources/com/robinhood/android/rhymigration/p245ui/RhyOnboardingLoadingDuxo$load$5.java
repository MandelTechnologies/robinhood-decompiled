package com.robinhood.android.rhymigration.p245ui;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RhyOnboardingLoadingDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo", m3645f = "RhyOnboardingLoadingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE}, m3647m = "loadCmShutdownUpsellPage")
/* loaded from: classes5.dex */
final class RhyOnboardingLoadingDuxo$load$5 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RhyOnboardingLoadingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyOnboardingLoadingDuxo$load$5(RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo, Continuation<? super RhyOnboardingLoadingDuxo$load$5> continuation) {
        super(continuation);
        this.this$0 = rhyOnboardingLoadingDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadCmShutdownUpsellPage(null, this);
    }
}
