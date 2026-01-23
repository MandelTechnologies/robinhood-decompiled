package com.robinhood.shared.discover.section;

import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: DiscoverSectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$Header$3$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class DiscoverSectionComposable2 extends AdaptedFunctionReference implements Function0<Unit> {
    DiscoverSectionComposable2(Object obj) {
        super(0, obj, RhModalBottomSheet5.class, "hideBottomSheet", "hideBottomSheet(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/DisposableHandle;", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        RhModalBottomSheet5.hideBottomSheet$default((RhModalBottomSheet5) this.receiver, null, 1, null);
    }
}
