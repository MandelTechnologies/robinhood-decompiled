package com.robinhood.android.event.detail.p129ui.bottomsheets;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.event.detail.C16095R;
import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventDetailDisplayDataBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001aA\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\n\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u0003H\u0003\u001a\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"EventDetailDisplayDataBottomSheet", "", "currentDisplayMode", "Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;", "onDisplayModeChange", "Lkotlin/Function1;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DisplayDataContent", "dismiss", "displayNameStringResId", "", "valueDisplayRowMeta", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "itemDisplayName", "", "isActiveItem", "", "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.ui.bottomsheets.EventDetailDisplayDataBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailDisplayDataBottomSheet2 {

    /* compiled from: EventDetailDisplayDataBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.detail.ui.bottomsheets.EventDetailDisplayDataBottomSheetKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventDetailDisplayDataBottomSheet.values().length];
            try {
                iArr[EventDetailDisplayDataBottomSheet.LAST_YES_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventDetailDisplayDataBottomSheet.OPEN_PNL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayDataContent$lambda$5(EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DisplayDataContent(eventDetailDisplayDataBottomSheet, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailDisplayDataBottomSheet$lambda$0(EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventDetailDisplayDataBottomSheet(eventDetailDisplayDataBottomSheet, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void EventDetailDisplayDataBottomSheet(final EventDetailDisplayDataBottomSheet currentDisplayMode, final Function1<? super EventDetailDisplayDataBottomSheet, Unit> onDisplayModeChange, final Function0<Unit> onDismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(currentDisplayMode, "currentDisplayMode");
        Intrinsics.checkNotNullParameter(onDisplayModeChange, "onDisplayModeChange");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1464644364);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(currentDisplayMode.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisplayModeChange) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1464644364, i3, -1, "com.robinhood.android.event.detail.ui.bottomsheets.EventDetailDisplayDataBottomSheet (EventDetailDisplayDataBottomSheet.kt:36)");
            }
            int i5 = i3 >> 6;
            int i6 = (i5 & 14) | 1572864 | (i5 & 112);
            Modifier modifier4 = modifier3;
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, modifier4, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(57284325, true, new C162151(currentDisplayMode, onDisplayModeChange, onDismiss), composerStartRestartGroup, 54), composerStartRestartGroup, i6, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.ui.bottomsheets.EventDetailDisplayDataBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailDisplayDataBottomSheet2.EventDetailDisplayDataBottomSheet$lambda$0(currentDisplayMode, onDisplayModeChange, onDismiss, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: EventDetailDisplayDataBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.detail.ui.bottomsheets.EventDetailDisplayDataBottomSheetKt$EventDetailDisplayDataBottomSheet$1 */
    static final class C162151 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ EventDetailDisplayDataBottomSheet $currentDisplayMode;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ Function1<EventDetailDisplayDataBottomSheet, Unit> $onDisplayModeChange;

        /* JADX WARN: Multi-variable type inference failed */
        C162151(EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, Function1<? super EventDetailDisplayDataBottomSheet, Unit> function1, Function0<Unit> function0) {
            this.$currentDisplayMode = eventDetailDisplayDataBottomSheet;
            this.$onDisplayModeChange = function1;
            this.$onDismiss = function0;
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
                ComposerKt.traceEventStart(57284325, i, -1, "com.robinhood.android.event.detail.ui.bottomsheets.EventDetailDisplayDataBottomSheet.<anonymous> (EventDetailDisplayDataBottomSheet.kt:41)");
            }
            EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet = this.$currentDisplayMode;
            Function1<EventDetailDisplayDataBottomSheet, Unit> function1 = this.$onDisplayModeChange;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = ((i & 14) == 4 || ((i & 8) != 0 && composer.changedInstance(RhModalBottomSheet))) | composer.changed(this.$onDismiss);
            final Function0<Unit> function0 = this.$onDismiss;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.event.detail.ui.bottomsheets.EventDetailDisplayDataBottomSheetKt$EventDetailDisplayDataBottomSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EventDetailDisplayDataBottomSheet2.C162151.invoke$lambda$1$lambda$0(RhModalBottomSheet, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EventDetailDisplayDataBottomSheet2.DisplayDataContent(eventDetailDisplayDataBottomSheet, function1, (Function0) objRememberedValue, Modifier.INSTANCE, composer, 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5, Function0 function0) {
            rhModalBottomSheet5.hideBottomSheet(function0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DisplayDataContent(final EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, final Function1<? super EventDetailDisplayDataBottomSheet, Unit> function1, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        Iterator<EventDetailDisplayDataBottomSheet> it;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2118926530);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(eventDetailDisplayDataBottomSheet.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2118926530, i3, -1, "com.robinhood.android.event.detail.ui.bottomsheets.DisplayDataContent (EventDetailDisplayDataBottomSheet.kt:58)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C16095R.string.event_detail_display_data_bottom_sheet_title, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5144paddingVpY3zN4$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8124);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(779877376);
                it = EventDetailDisplayDataBottomSheet.getEntries().iterator();
                while (it.hasNext()) {
                    final EventDetailDisplayDataBottomSheet next = it.next();
                    String strStringResource2 = StringResources_androidKt.stringResource(displayNameStringResId(next), composer2, 0);
                    final boolean z = eventDetailDisplayDataBottomSheet == next;
                    BentoBaseRowState.Meta metaValueDisplayRowMeta = valueDisplayRowMeta(strStringResource2, z, composer2, 0);
                    composer2.startReplaceGroup(-1224400529);
                    boolean zChanged = composer2.changed(z) | ((i3 & 112) == 32) | composer2.changed(next.ordinal()) | ((i3 & 896) == 256);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.event.detail.ui.bottomsheets.EventDetailDisplayDataBottomSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EventDetailDisplayDataBottomSheet2.DisplayDataContent$lambda$4$lambda$3$lambda$2$lambda$1(z, function1, next, function0);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource2, null, null, metaValueDisplayRowMeta, null, false, false, false, 0L, (Function0) objRememberedValue, composer3, BentoBaseRowState.Meta.$stable << 15, 0, 2011);
                    composer2 = composer3;
                }
                composer2.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.ui.bottomsheets.EventDetailDisplayDataBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventDetailDisplayDataBottomSheet2.DisplayDataContent$lambda$5(eventDetailDisplayDataBottomSheet, function1, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String strStringResource3 = StringResources_androidKt.stringResource(C16095R.string.event_detail_display_data_bottom_sheet_title, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifier52 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource3, PaddingKt.m5144paddingVpY3zN4$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8124);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(779877376);
                it = EventDetailDisplayDataBottomSheet.getEntries().iterator();
                while (it.hasNext()) {
                }
                composer2.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayDataContent$lambda$4$lambda$3$lambda$2$lambda$1(boolean z, Function1 function1, EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, Function0 function0) {
        if (!z) {
            function1.invoke(eventDetailDisplayDataBottomSheet);
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final int displayNameStringResId(EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet) {
        int i = WhenMappings.$EnumSwitchMapping$0[eventDetailDisplayDataBottomSheet.ordinal()];
        if (i == 1) {
            return C16095R.string.event_detail_display_data_bottom_sheet_option_last_yes_price;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C16095R.string.event_detail_display_data_bottom_sheet_option_open_pnl;
    }

    private static final BentoBaseRowState.Meta valueDisplayRowMeta(String str, boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-104932575);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-104932575, i, -1, "com.robinhood.android.event.detail.ui.bottomsheets.valueDisplayRowMeta (EventDetailDisplayDataBottomSheet.kt:105)");
        }
        BentoBaseRowState.Meta.Icon icon = z ? new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.CHECKMARK_24, StringResources_androidKt.stringResource(C16095R.string.f4138x6e357182, new Object[]{str}, composer, 0), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getPrime()), (Function0) null, 8, (DefaultConstructorMarker) null) : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return icon;
    }
}
