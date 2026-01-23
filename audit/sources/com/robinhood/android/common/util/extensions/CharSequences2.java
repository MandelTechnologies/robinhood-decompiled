package com.robinhood.android.common.util.extensions;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: CharSequences.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
/* renamed from: com.robinhood.android.common.util.extensions.CharSequencesKt$buildTextWithClickableLink$clickableSpan$1, reason: use source file name */
/* loaded from: classes2.dex */
public final class CharSequences2 implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $action;

    public CharSequences2(Function0<Unit> function0) {
        this.$action = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$action.invoke();
    }
}
