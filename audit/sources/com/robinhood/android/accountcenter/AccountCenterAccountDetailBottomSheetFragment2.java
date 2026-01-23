package com.robinhood.android.accountcenter;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountCenterAccountDetailBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$AccountBreakdown$1$1$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AccountCenterAccountDetailBottomSheetFragment2 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Function1<String, Unit> $onInfoImageClicked;
    final /* synthetic */ UiTypedAccountCenterItem.CollapsedSectionItem $section;
    final /* synthetic */ AccountCenterAccountDetailBottomSheetFragment this$0;

    /* JADX WARN: Multi-variable type inference failed */
    AccountCenterAccountDetailBottomSheetFragment2(UiTypedAccountCenterItem.CollapsedSectionItem collapsedSectionItem, AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment, Function1<? super String, Unit> function1) {
        this.$section = collapsedSectionItem;
        this.this$0 = accountCenterAccountDetailBottomSheetFragment;
        this.$onInfoImageClicked = function1;
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
            ComposerKt.traceEventStart(-1525166966, i, -1, "com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment.AccountBreakdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountCenterAccountDetailBottomSheetFragment.kt:93)");
        }
        String title = this.$section.getTitle();
        String subtitle = this.$section.getSubtitle();
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
        String infoActionContentDescription = this.$section.getInfoActionContentDescription();
        AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment = this.this$0;
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$onInfoImageClicked) | composer.changedInstance(this.$section);
        final Function1<String, Unit> function1 = this.$onInfoImageClicked;
        final UiTypedAccountCenterItem.CollapsedSectionItem collapsedSectionItem = this.$section;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$AccountBreakdown$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountCenterAccountDetailBottomSheetFragment2.invoke$lambda$1$lambda$0(function1, collapsedSectionItem);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        accountCenterAccountDetailBottomSheetFragment.AccountTypeHeader(title, subtitle, infoActionContentDescription, modifierM5146paddingqDBjuR0$default, (Function0) objRememberedValue, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, UiTypedAccountCenterItem.CollapsedSectionItem collapsedSectionItem) {
        function1.invoke(collapsedSectionItem.getDefinitionsMarkdown());
        return Unit.INSTANCE;
    }
}
