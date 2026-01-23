package com.robinhood.android.optionschain;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OptionChainActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivity", m3645f = "OptionChainActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, EnumC7081g.f2773x8d9721ad}, m3647m = "updateOptionChainDisplayMode$feature_options_chain_externalDebug")
/* renamed from: com.robinhood.android.optionschain.OptionChainActivity$updateOptionChainDisplayMode$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionChainActivity5 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OptionChainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainActivity5(OptionChainActivity optionChainActivity, Continuation<? super OptionChainActivity5> continuation) {
        super(continuation);
        this.this$0 = optionChainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateOptionChainDisplayMode$feature_options_chain_externalDebug(this);
    }
}
