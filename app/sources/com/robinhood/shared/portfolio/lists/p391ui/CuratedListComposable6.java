package com.robinhood.shared.portfolio.lists.p391ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt$curatedList$3$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CuratedListComposable6 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ CuratedListDuxo7 $curatedItem;
    final /* synthetic */ CuratedListState $curatedListState;
    final /* synthetic */ Ref.BooleanRef $isExpanded;

    CuratedListComposable6(CuratedListDuxo7 curatedListDuxo7, CuratedListState curatedListState, Ref.BooleanRef booleanRef) {
        this.$curatedItem = curatedListDuxo7;
        this.$curatedListState = curatedListState;
        this.$isExpanded = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1091798081, i, -1, "com.robinhood.shared.portfolio.lists.ui.curatedList.<anonymous>.<anonymous> (CuratedListComposable.kt:131)");
        }
        CuratedListDuxo7 curatedListDuxo7 = this.$curatedItem;
        CuratedListState.Loaded loaded = (CuratedListState.Loaded) this.$curatedListState;
        final Ref.BooleanRef booleanRef = this.$isExpanded;
        boolean z = booleanRef.element;
        Function1 function1 = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt$curatedList$3$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListComposable6.invoke$lambda$0(booleanRef, ((Boolean) obj).booleanValue());
            }
        };
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$curatedListState);
        final CuratedListState curatedListState = this.$curatedListState;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt$curatedList$3$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CuratedListComposable6.invoke$lambda$2$lambda$1(curatedListState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CuratedListComposable5.CuratedListItem(curatedListDuxo7, loaded, z, null, false, null, function1, (Function0) objRememberedValue, composer, 0, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Ref.BooleanRef booleanRef, boolean z) {
        booleanRef.element = z;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(CuratedListState curatedListState) {
        ((CuratedListState.Loaded) curatedListState).getShowReorderCuratedListBottomSheet().invoke();
        return Unit.INSTANCE;
    }
}
