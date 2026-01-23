package com.robinhood.android.internalassettransfers.validation;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheet2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountFeatureParityBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0007¢\u0006\u0002\u0010\u000b\u001a1\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0003¢\u0006\u0002\u0010\r\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u000e"}, m3636d2 = {"MarginAlertData", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "getMarginAlertData", "()Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "AccountFeatureParityBottomSheet", "", "bottomSheetData", "onPrimaryButtonClick", "Lkotlin/Function0;", "onSecondaryButtonClick", "dismissBottomSheet", "(Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BottomSheetContent", "(Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AccountFeatureParityBottomSheet2 {
    private static final AccountFeatureParityBottomSheetData MarginAlertData;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountFeatureParityBottomSheet$lambda$0(AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        AccountFeatureParityBottomSheet(accountFeatureParityBottomSheetData, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetContent$lambda$4(AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        BottomSheetContent(accountFeatureParityBottomSheetData, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static {
        StringResource.Companion companion = StringResource.INSTANCE;
        MarginAlertData = new AccountFeatureParityBottomSheetData(companion.invoke(C18977R.string.margin_not_not_enabled_with_margin_balance_title, new Object[0]), companion.invoke(C18977R.string.margin_not_not_enabled_with_margin_balance_subtitle, new Object[0]), companion.invoke(C18977R.string.enabled_margin_cta, new Object[0]), companion.invoke(C11048R.string.general_label_got_it, new Object[0]), Integer.valueOf(C20690R.drawable.pict_mono_rds_warning));
    }

    public static final AccountFeatureParityBottomSheetData getMarginAlertData() {
        return MarginAlertData;
    }

    public static final void AccountFeatureParityBottomSheet(final AccountFeatureParityBottomSheetData bottomSheetData, final Function0<Unit> onPrimaryButtonClick, final Function0<Unit> onSecondaryButtonClick, final Function0<Unit> dismissBottomSheet, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClick, "onSecondaryButtonClick");
        Intrinsics.checkNotNullParameter(dismissBottomSheet, "dismissBottomSheet");
        Composer composerStartRestartGroup = composer.startRestartGroup(1249092578);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bottomSheetData) : composerStartRestartGroup.changedInstance(bottomSheetData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPrimaryButtonClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSecondaryButtonClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(dismissBottomSheet) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1249092578, i2, -1, "com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheet (AccountFeatureParityBottomSheet.kt:49)");
            }
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(dismissBottomSheet, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1441786345, true, new C193371(bottomSheetData, dismissBottomSheet, onPrimaryButtonClick, onSecondaryButtonClick), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 9) & 14) | 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountFeatureParityBottomSheet2.AccountFeatureParityBottomSheet$lambda$0(bottomSheetData, onPrimaryButtonClick, onSecondaryButtonClick, dismissBottomSheet, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AccountFeatureParityBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetKt$AccountFeatureParityBottomSheet$1 */
    static final class C193371 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ AccountFeatureParityBottomSheetData $bottomSheetData;
        final /* synthetic */ Function0<Unit> $dismissBottomSheet;
        final /* synthetic */ Function0<Unit> $onPrimaryButtonClick;
        final /* synthetic */ Function0<Unit> $onSecondaryButtonClick;

        C193371(AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            this.$bottomSheetData = accountFeatureParityBottomSheetData;
            this.$dismissBottomSheet = function0;
            this.$onPrimaryButtonClick = function02;
            this.$onSecondaryButtonClick = function03;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1441786345, i, -1, "com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheet.<anonymous> (AccountFeatureParityBottomSheet.kt:53)");
            }
            AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData = this.$bottomSheetData;
            composer.startReplaceGroup(-1746271574);
            int i2 = i & 14;
            boolean z = true;
            boolean zChanged = (i2 == 4 || ((i & 8) != 0 && composer.changedInstance(RhModalBottomSheet))) | composer.changed(this.$dismissBottomSheet) | composer.changed(this.$onPrimaryButtonClick);
            final Function0<Unit> function0 = this.$dismissBottomSheet;
            final Function0<Unit> function02 = this.$onPrimaryButtonClick;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetKt$AccountFeatureParityBottomSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountFeatureParityBottomSheet2.C193371.invoke$lambda$1$lambda$0(RhModalBottomSheet, function0, function02);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function03 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            if (i2 != 4 && ((i & 8) == 0 || !composer.changedInstance(RhModalBottomSheet))) {
                z = false;
            }
            boolean zChanged2 = composer.changed(this.$dismissBottomSheet) | z | composer.changed(this.$onSecondaryButtonClick);
            final Function0<Unit> function04 = this.$dismissBottomSheet;
            final Function0<Unit> function05 = this.$onSecondaryButtonClick;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetKt$AccountFeatureParityBottomSheet$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountFeatureParityBottomSheet2.C193371.invoke$lambda$3$lambda$2(RhModalBottomSheet, function04, function05);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AccountFeatureParityBottomSheet2.BottomSheetContent(accountFeatureParityBottomSheetData, function03, (Function0) objRememberedValue2, composer, StringResource.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5, Function0 function0, Function0 function02) {
            rhModalBottomSheet5.hideBottomSheet(function0);
            function02.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(RhModalBottomSheet5 rhModalBottomSheet5, Function0 function0, Function0 function02) {
            rhModalBottomSheet5.hideBottomSheet(function0);
            function02.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomSheetContent(final AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        Object obj;
        float f;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        Composer composerStartRestartGroup = composer.startRestartGroup(924231691);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(accountFeatureParityBottomSheetData) : composerStartRestartGroup.changedInstance(accountFeatureParityBottomSheetData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i5 = i2;
        if ((i5 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function0;
            function04 = function02;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(924231691, i5, -1, "com.robinhood.android.internalassettransfers.validation.BottomSheetContent (AccountFeatureParityBottomSheet.kt:72)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Integer pogResourceId = accountFeatureParityBottomSheetData.getPogResourceId();
            composerStartRestartGroup.startReplaceGroup(1077959050);
            if (pogResourceId == null) {
                obj = null;
                i3 = i5;
                f = 0.0f;
                i4 = i6;
            } else {
                i3 = i5;
                i4 = i6;
                obj = null;
                f = 0.0f;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(pogResourceId.intValue(), column6.align(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), companion2.getCenterHorizontally()), false, BentoPogSize.Hero, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), composerStartRestartGroup, 3072, 20);
                composerStartRestartGroup = composerStartRestartGroup;
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            StringResource title = accountFeatureParityBottomSheetData.getTitle();
            int i7 = StringResource.$stable;
            String string2 = StringResource2.getString(title, composerStartRestartGroup, i7);
            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleSmall();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            Composer composer2 = composerStartRestartGroup;
            int i8 = i4;
            BentoText2.m20747BentoText38GnDrw(string2, SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), f, 1, obj), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer2, 0, 0, 8120);
            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(accountFeatureParityBottomSheetData.getSubtitle(), composer2, i7), SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextM(), composer2, 0, 0, 8120);
            composerStartRestartGroup = composer2;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), 7, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResource2.getString(accountFeatureParityBottomSheetData.getPrimaryButtonText(), composerStartRestartGroup, i7), SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i3 >> 3) & 14, 0, 8184);
            composerStartRestartGroup.startReplaceGroup(-1116517037);
            if (accountFeatureParityBottomSheetData.getSecondaryButtonText() != null) {
                function03 = function0;
                function04 = function02;
                BentoButtonKt.m20586BentoButtonEikTQX8(function04, StringResource2.getString(accountFeatureParityBottomSheetData.getSecondaryButtonText(), composerStartRestartGroup, i7), SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i3 >> 6) & 14) | 24576, 0, 8168);
            } else {
                function03 = function0;
                function04 = function02;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AccountFeatureParityBottomSheet2.BottomSheetContent$lambda$4(accountFeatureParityBottomSheetData, function03, function04, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }
}
