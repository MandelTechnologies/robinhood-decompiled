package com.robinhood.lib.transfers.nonoriginated;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NonOriginatedAccountInfoComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$Sections$1$1$1$4, reason: use source file name */
/* loaded from: classes3.dex */
final class NonOriginatedAccountInfoComposable8 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ int $index;
    final /* synthetic */ Function1<Integer, Unit> $onExpandOrCollapseClick;
    final /* synthetic */ NonOriginatedAccountInfoState.Section $section;

    /* JADX WARN: Multi-variable type inference failed */
    NonOriginatedAccountInfoComposable8(NonOriginatedAccountInfoState.Section section, Function1<? super Integer, Unit> function1, int i) {
        this.$section = section;
        this.$onExpandOrCollapseClick = function1;
        this.$index = i;
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
            ComposerKt.traceEventStart(-1321883819, i, -1, "com.robinhood.lib.transfers.nonoriginated.Sections.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NonOriginatedAccountInfoComposable.kt:225)");
        }
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
        String strStringResource = StringResources_androidKt.stringResource(this.$section.isExpanded() ? C11048R.string.disclosure_show_less : C11048R.string.disclosure_show_more, composer, 0);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$onExpandOrCollapseClick) | composer.changed(this.$index);
        final Function1<Integer, Unit> function1 = this.$onExpandOrCollapseClick;
        final int i2 = this.$index;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$Sections$1$1$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NonOriginatedAccountInfoComposable8.invoke$lambda$1$lambda$0(function1, i2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, null, false, null, composer, 0, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
