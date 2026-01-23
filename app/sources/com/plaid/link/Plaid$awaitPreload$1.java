package com.plaid.link;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.plaid.link.Plaid", m3645f = "Plaid.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "awaitPreload$link_sdk_release")
/* loaded from: classes24.dex */
public final class Plaid$awaitPreload$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Plaid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$awaitPreload$1(Plaid plaid, Continuation<? super Plaid$awaitPreload$1> continuation) {
        super(continuation);
        this.this$0 = plaid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitPreload$link_sdk_release(this);
    }
}
