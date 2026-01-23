package com.robinhood.android.creditcard.p091ui.creditapplication.address.manualEntry;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Dp3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ManualAddressEntryComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $cityDropdownExpanded$delegate;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ SnapshotState<String> $state$delegate;
    final /* synthetic */ List<Tuples2<String, String>> $stateCodesToNames;

    ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5(SnapshotState<Boolean> snapshotState, SnapshotState<String> snapshotState2, FocusManager focusManager, List<Tuples2<String, String>> list) {
        this.$cityDropdownExpanded$delegate = snapshotState;
        this.$state$delegate = snapshotState2;
        this.$focusManager = focusManager;
        this.$stateCodesToNames = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(FocusManager focusManager, SnapshotState snapshotState) {
        if (!ManualAddressEntryComposableKt.ManualAddressEntry$lambda$22(snapshotState)) {
            FocusManager.clearFocus$default(focusManager, false, 1, null);
        }
        ManualAddressEntryComposableKt.ManualAddressEntry$lambda$23(snapshotState, !ManualAddressEntryComposableKt.ManualAddressEntry$lambda$22(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ManualAddressEntryComposableKt.ManualAddressEntry$lambda$23(snapshotState, it.isFocused());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(614230658, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntry.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManualAddressEntryComposable.kt:154)");
        }
        String strManualAddressEntry$lambda$14 = ManualAddressEntryComposableKt.ManualAddressEntry$lambda$14(this.$state$delegate);
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_address_state_placeholder, composer, 0);
        BentoTextInput8.Icon.Size24 size24 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.DROPDOWN_24, null, null, 6, null);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierTestTag = TestTag3.testTag(companion, ManualAddressEntryComposableKt.MANUAL_ADDRESS_ENTRY_ADDRESS_STATE_INPUT_TEST_TAG);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$cityDropdownExpanded$delegate);
        final SnapshotState<Boolean> snapshotState = this.$cityDropdownExpanded$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5.invoke$lambda$1$lambda$0(snapshotState, (FocusState) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierTestTag, (Function1) objRememberedValue);
        composer.startReplaceGroup(5004770);
        boolean zChanged2 = composer.changed(this.$state$delegate);
        final SnapshotState<String> snapshotState2 = this.$state$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5.invoke$lambda$3$lambda$2(snapshotState2, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function1 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged3 = composer.changed(this.$cityDropdownExpanded$delegate) | composer.changedInstance(this.$focusManager);
        final FocusManager focusManager = this.$focusManager;
        final SnapshotState<Boolean> snapshotState3 = this.$cityDropdownExpanded$delegate;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5.invoke$lambda$5$lambda$4(focusManager, snapshotState3);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        BentoTextInput4.BentoTextInput(strManualAddressEntry$lambda$14, function1, modifierOnFocusChanged, null, strStringResource, null, null, null, size24, (Function0) objRememberedValue3, null, null, null, false, false, composer, BentoTextInput8.Icon.Size24.$stable << 24, 0, 31976);
        boolean zManualAddressEntry$lambda$22 = ManualAddressEntryComposableKt.ManualAddressEntry$lambda$22(this.$cityDropdownExpanded$delegate);
        composer.startReplaceGroup(1865175507);
        float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
        composer.endReplaceGroup();
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
        long jM8009constructorimpl = Dp3.m8009constructorimpl((Float.floatToRawIntBits(fM7995constructorimpl) & 4294967295L) | (Float.floatToRawIntBits(fMo5013toDpu2uoSUM) << 32));
        Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.m5156height3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(375)), ManualAddressEntryComposableKt.MANUAL_ADDRESS_ENTRY_ADDRESS_STATE_DROPDOWN_TEST_TAG);
        composer.startReplaceGroup(5004770);
        boolean zChanged4 = composer.changed(this.$cityDropdownExpanded$delegate);
        final SnapshotState<Boolean> snapshotState4 = this.$cityDropdownExpanded$delegate;
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5.invoke$lambda$8$lambda$7(snapshotState4);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        AndroidMenu_androidKt.m5699DropdownMenuIlH_yew(zManualAddressEntry$lambda$22, (Function0) objRememberedValue4, modifierTestTag2, jM8009constructorimpl, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-845526297, true, new C122756(this.$stateCodesToNames, this.$state$delegate, this.$cityDropdownExpanded$delegate), composer, 54), composer, 0, 48, 2032);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(SnapshotState snapshotState) {
        ManualAddressEntryComposableKt.ManualAddressEntry$lambda$23(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: ManualAddressEntryComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5$6 */
    static final class C122756 implements Function3<Column5, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $cityDropdownExpanded$delegate;
        final /* synthetic */ SnapshotState<String> $state$delegate;
        final /* synthetic */ List<Tuples2<String, String>> $stateCodesToNames;

        C122756(List<Tuples2<String, String>> list, SnapshotState<String> snapshotState, SnapshotState<Boolean> snapshotState2) {
            this.$stateCodesToNames = list;
            this.$state$delegate = snapshotState;
            this.$cityDropdownExpanded$delegate = snapshotState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
            invoke(column5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Column5 DropdownMenu, Composer composer, int i) {
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
            if ((i & 17) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-845526297, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntry.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManualAddressEntryComposable.kt:181)");
            }
            List<Tuples2<String, String>> list = this.$stateCodesToNames;
            final SnapshotState<String> snapshotState = this.$state$delegate;
            final SnapshotState<Boolean> snapshotState2 = this.$cityDropdownExpanded$delegate;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                final Tuples2 tuples2 = (Tuples2) it.next();
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, (String) tuples2.getFirst());
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-851790836, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5$6$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i2) {
                        if ((i2 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-851790836, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntry.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManualAddressEntryComposable.kt:186)");
                        }
                        String second = tuples2.getSecond();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        TextKt.m6028Text4IGK_g(second, null, bentoTheme.getColors(composer3, i3).m21425getFg0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bentoTheme.getTypography(composer3, i3).getTextM(), composer3, 0, 0, 65530);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54);
                composer2.startReplaceGroup(-1746271574);
                boolean zChanged = composer2.changed(snapshotState) | composer2.changed(tuples2) | composer2.changed(snapshotState2);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5$6$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5.C122756.invoke$lambda$2$lambda$1$lambda$0(tuples2, snapshotState, snapshotState2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) objRememberedValue, modifierTestTag, null, null, false, null, null, null, composer2, 6, 504);
                arrayList.add(Unit.INSTANCE);
                composer2 = composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Tuples2 tuples2, SnapshotState snapshotState, SnapshotState snapshotState2) {
            snapshotState.setValue((String) tuples2.getFirst());
            ManualAddressEntryComposableKt.ManualAddressEntry$lambda$23(snapshotState2, false);
            return Unit.INSTANCE;
        }
    }
}
