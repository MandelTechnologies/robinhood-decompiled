package com.robinhood.shared.common.screenshot.sharing.p372ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.common.screenshot.sharing.p372ui.ShareScreenshotBottomSheet2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ShareScreenshotBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.common.screenshot.sharing.ui.ShareOptionAction$Copy", m3645f = "ShareScreenshotBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m3647m = "onClick")
/* renamed from: com.robinhood.shared.common.screenshot.sharing.ui.ShareOptionAction$Copy$onClick$1, reason: use source file name */
/* loaded from: classes26.dex */
final class ShareScreenshotBottomSheet3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShareScreenshotBottomSheet2.Copy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareScreenshotBottomSheet3(ShareScreenshotBottomSheet2.Copy copy, Continuation<? super ShareScreenshotBottomSheet3> continuation) {
        super(continuation);
        this.this$0 = copy;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onClick(null, null, null, null, null, this);
    }
}
