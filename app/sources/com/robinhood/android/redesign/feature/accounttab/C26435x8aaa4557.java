package com.robinhood.android.redesign.feature.accounttab;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt", m3645f = "AccountSelectorComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "AccountSelectorComposable$performSnapToTarget")
/* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$performSnapToTarget$1 */
/* loaded from: classes5.dex */
final class C26435x8aaa4557 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    C26435x8aaa4557(Continuation<? super C26435x8aaa4557> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AccountSelectorComposableKt.AccountSelectorComposable$performSnapToTarget(null, null, null, this);
    }
}
