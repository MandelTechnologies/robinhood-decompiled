package com.robinhood.shared.common.agreementview;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.AppBarStyle;
import com.robinhood.compose.theme.style.BentoSelectionRowStyle;
import com.robinhood.compose.theme.style.ButtonBarStyle;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.compose.theme.style.CardStackStyle;
import com.robinhood.compose.theme.style.ChartStyle;
import com.robinhood.compose.theme.style.CheckboxStyle;
import com.robinhood.compose.theme.style.CircularProgressIndicatorStyle;
import com.robinhood.compose.theme.style.CommunicationCardStyle;
import com.robinhood.compose.theme.style.ExpandableButtonTrayStyle;
import com.robinhood.compose.theme.style.IconButtonStyle;
import com.robinhood.compose.theme.style.InfoBannerStyle;
import com.robinhood.compose.theme.style.LoadingPlaceholderStyle;
import com.robinhood.compose.theme.style.MarkdownSpannedTextStyle;
import com.robinhood.compose.theme.style.NavigationBarStyle;
import com.robinhood.compose.theme.style.NumpadStyle;
import com.robinhood.compose.theme.style.PlaceholderStyle;
import com.robinhood.compose.theme.style.PogStyle;
import com.robinhood.compose.theme.style.ProgressBarStyle;
import com.robinhood.compose.theme.style.RadioButtonStyle;
import com.robinhood.compose.theme.style.RowStyle;
import com.robinhood.compose.theme.style.SpanButtonStyle;
import com.robinhood.compose.theme.style.TextButtonStyle;
import com.robinhood.compose.theme.style.TextInputStyle;
import com.robinhood.compose.theme.style.ToggleRowStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AgreementAdditionalCheckboxes.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"AgreementAdditionalCheckboxes", "", "checkboxes", "Lkotlinx/collections/immutable/ImmutableList;", "", "modifier", "Landroidx/compose/ui/Modifier;", "selectionRowTextStyle", "Landroidx/compose/ui/text/TextStyle;", "onAllCheckboxesCheckedChanged", "Lkotlin/Function1;", "", "defaultCheckedState", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "lib-agreement-view_externalDebug", "allCheckboxesChecked"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxesKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class AgreementAdditionalCheckboxes {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgreementAdditionalCheckboxes$lambda$10(ImmutableList immutableList, Modifier modifier, TextStyle textStyle, Function1 function1, boolean z, int i, int i2, Composer composer, int i3) {
        AgreementAdditionalCheckboxes(immutableList, modifier, textStyle, function1, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgreementAdditionalCheckboxes$lambda$1$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AgreementAdditionalCheckboxes(final ImmutableList<String> checkboxes, Modifier modifier, TextStyle textStyle, Function1<? super Boolean, Unit> function1, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TextStyle textStyle2;
        int i4;
        Function1<? super Boolean, Unit> function12;
        int i5;
        boolean z2;
        Modifier modifier3;
        final TextStyle textM;
        int i6;
        Function1<? super Boolean, Unit> function13;
        final boolean z3;
        Object objRememberedValue;
        Object objRememberedValue2;
        Composer.Companion companion;
        SnapshotState4 snapshotState4;
        boolean z4;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier4;
        final TextStyle textStyle3;
        final Function1<? super Boolean, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(checkboxes, "checkboxes");
        Composer composerStartRestartGroup = composer.startRestartGroup(517503196);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(checkboxes) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    textStyle2 = textStyle;
                    int i8 = composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                    i3 |= i8;
                } else {
                    textStyle2 = textStyle;
                }
                i3 |= i8;
            } else {
                textStyle2 = textStyle;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 4) == 0) {
                                textM = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM();
                                i3 &= -897;
                            } else {
                                textM = textStyle2;
                            }
                            if (i4 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxesKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AgreementAdditionalCheckboxes.AgreementAdditionalCheckboxes$lambda$1$lambda$0(((Boolean) obj).booleanValue());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function12 = (Function1) objRememberedValue4;
                            }
                            i6 = i3;
                            function13 = function12;
                            if (i5 == 0) {
                                z3 = true;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(517503196, i6, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes (AgreementAdditionalCheckboxes.kt:39)");
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(checkboxes, 10));
                                for (String str : checkboxes) {
                                    arrayList.add(Boolean.valueOf(z3));
                                }
                                Boolean[] boolArr = (Boolean[]) arrayList.toArray(new Boolean[0]);
                                objRememberedValue = SnapshotStateKt.mutableStateListOf(Arrays.copyOf(boolArr, boolArr.length));
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            final SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxesKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Boolean.valueOf(AgreementAdditionalCheckboxes.AgreementAdditionalCheckboxes$lambda$6$lambda$5(snapshotStateList));
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            snapshotState4 = (SnapshotState4) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            Boolean boolValueOf = Boolean.valueOf(AgreementAdditionalCheckboxes$lambda$7(snapshotState4));
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            z4 = (i6 & 7168) == 2048;
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z4 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new AgreementAdditionalCheckboxes2(function13, snapshotState4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor);
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Function1<? super Boolean, Unit> function15 = function13;
                            AnimatedVisibilityKt.AnimatedVisibility(Column6.INSTANCE, !AgreementAdditionalCheckboxes$lambda$7(snapshotState4), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, AgreementAdditionalCheckboxes5.INSTANCE.getLambda$1228603434$lib_agreement_view_externalDebug(), composerStartRestartGroup, 1572870, 30);
                            final Styles styles = (Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles());
                            CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(new Styles(textM) { // from class: com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxesKt$AgreementAdditionalCheckboxes$3$modifiedRowStyles$1
                                private final /* synthetic */ Styles $$delegate_0;
                                final /* synthetic */ TextStyle $selectionRowTextStyle;

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public AppBarStyle getAppBar(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(1105290489);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1105290489, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-appBar> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    AppBarStyle appBar = this.$$delegate_0.getAppBar(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return appBar;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public ButtonStyle getButton(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-621508615);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-621508615, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-button> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    ButtonStyle button = this.$$delegate_0.getButton(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return button;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public ButtonBarStyle getButtonBar(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(1529322104);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1529322104, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-buttonBar> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    ButtonBarStyle buttonBar = this.$$delegate_0.getButtonBar(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return buttonBar;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public CardStackStyle getCardStackStyle(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(991617681);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(991617681, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-cardStackStyle> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    CardStackStyle cardStackStyle = this.$$delegate_0.getCardStackStyle(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return cardStackStyle;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public ChartStyle getChart(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-807939851);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-807939851, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-chart> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    ChartStyle chart = this.$$delegate_0.getChart(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return chart;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public CheckboxStyle getCheckBox(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(466968872);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(466968872, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-checkBox> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    CheckboxStyle checkBox = this.$$delegate_0.getCheckBox(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return checkBox;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(1867117498);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1867117498, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-circularProgressIndicator> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    CircularProgressIndicatorStyle circularProgressIndicator = this.$$delegate_0.getCircularProgressIndicator(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return circularProgressIndicator;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public CommunicationCardStyle getCommunicationCard(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-419410915);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-419410915, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-communicationCard> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    CommunicationCardStyle communicationCard = this.$$delegate_0.getCommunicationCard(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return communicationCard;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-1597959409);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1597959409, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-expandableButtonTray> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    ExpandableButtonTrayStyle expandableButtonTray = this.$$delegate_0.getExpandableButtonTray(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return expandableButtonTray;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public IconButtonStyle getIconButton(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-176435040);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-176435040, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-iconButton> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    IconButtonStyle iconButton = this.$$delegate_0.getIconButton(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return iconButton;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public InfoBannerStyle getInfoBanner(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-110233679);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-110233679, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-infoBanner> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    InfoBannerStyle infoBanner = this.$$delegate_0.getInfoBanner(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return infoBanner;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(400262430);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(400262430, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-loadingPlaceholderStyle> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    LoadingPlaceholderStyle loadingPlaceholderStyle = this.$$delegate_0.getLoadingPlaceholderStyle(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return loadingPlaceholderStyle;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(195282456);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(195282456, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-markdownSpannedText> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    MarkdownSpannedTextStyle markdownSpannedText = this.$$delegate_0.getMarkdownSpannedText(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return markdownSpannedText;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public NavigationBarStyle getNavigationBarStyle(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-238335496);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-238335496, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-navigationBarStyle> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    NavigationBarStyle navigationBarStyle = this.$$delegate_0.getNavigationBarStyle(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return navigationBarStyle;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public NumpadStyle getNumpad(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(1775920862);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1775920862, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-numpad> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    NumpadStyle numpad = this.$$delegate_0.getNumpad(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return numpad;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public PlaceholderStyle getPlaceholder(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-1886544662);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1886544662, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-placeholder> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    PlaceholderStyle placeholder = this.$$delegate_0.getPlaceholder(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return placeholder;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public PogStyle getPog(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-1502348513);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1502348513, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-pog> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    PogStyle pog = this.$$delegate_0.getPog(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return pog;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public ProgressBarStyle getProgressBarStyle(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-474006881);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-474006881, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-progressBarStyle> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    ProgressBarStyle progressBarStyle = this.$$delegate_0.getProgressBarStyle(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return progressBarStyle;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public RadioButtonStyle getRadioButton(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-1326856380);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1326856380, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-radioButton> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    RadioButtonStyle radioButton = this.$$delegate_0.getRadioButton(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return radioButton;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public BentoSelectionRowStyle getSelectionRowStyle(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-1012209845);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1012209845, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-selectionRowStyle> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    BentoSelectionRowStyle selectionRowStyle = this.$$delegate_0.getSelectionRowStyle(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return selectionRowStyle;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public SpanButtonStyle getSpanButton(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-644904177);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-644904177, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-spanButton> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    SpanButtonStyle spanButton = this.$$delegate_0.getSpanButton(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return spanButton;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public com.robinhood.compose.theme.style.TextStyle getText(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(946114238);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(946114238, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-text> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    com.robinhood.compose.theme.style.TextStyle text = this.$$delegate_0.getText(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return text;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public TextButtonStyle getTextButton(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(1525049580);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1525049580, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-textButton> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    TextButtonStyle textButton = this.$$delegate_0.getTextButton(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return textButton;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public TextInputStyle getTextInput(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(1433760532);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1433760532, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-textInput> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    TextInputStyle textInput = this.$$delegate_0.getTextInput(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return textInput;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public ToggleRowStyle getToggleRow(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-1166701059);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1166701059, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-toggleRow> (AgreementAdditionalCheckboxes.kt:0)");
                                    }
                                    ToggleRowStyle toggleRow = this.$$delegate_0.getToggleRow(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return toggleRow;
                                }

                                {
                                    this.$selectionRowTextStyle = textM;
                                    this.$$delegate_0 = this.$currentStyles;
                                }

                                @Override // com.robinhood.compose.theme.Styles
                                @JvmName
                                public RowStyle getRow(Composer composer2, int i9) {
                                    composer2.startReplaceGroup(-2102871439);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2102871439, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-row> (AgreementAdditionalCheckboxes.kt:80)");
                                    }
                                    RowStyle rowStyleCopy$default = RowStyle.copy$default(this.$currentStyles.getRow(composer2, 0), null, RowStyle.Typography.copy$default(this.$currentStyles.getRow(composer2, 0).getTypography(), this.$selectionRowTextStyle, null, null, 6, null), 1, null);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return rowStyleCopy$default;
                                }
                            }), ComposableLambda3.rememberComposableLambda(-1390333934, true, new AgreementAdditionalCheckboxes3(checkboxes, snapshotStateList), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            textStyle3 = textM;
                            function14 = function15;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            i6 = i3;
                            modifier3 = modifier2;
                            textM = textStyle2;
                            function13 = function12;
                        }
                        z3 = z2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final SnapshotStateList snapshotStateList2 = (SnapshotStateList) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        snapshotState4 = (SnapshotState4) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        Boolean boolValueOf2 = Boolean.valueOf(AgreementAdditionalCheckboxes$lambda$7(snapshotState4));
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        if ((i6 & 7168) == 2048) {
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                            objRememberedValue3 = new AgreementAdditionalCheckboxes2(function13, snapshotState4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                Function1<? super Boolean, Unit> function152 = function13;
                                AnimatedVisibilityKt.AnimatedVisibility(Column6.INSTANCE, !AgreementAdditionalCheckboxes$lambda$7(snapshotState4), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, AgreementAdditionalCheckboxes5.INSTANCE.getLambda$1228603434$lib_agreement_view_externalDebug(), composerStartRestartGroup, 1572870, 30);
                                final Styles styles2 = (Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles());
                                CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(new Styles(textM) { // from class: com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxesKt$AgreementAdditionalCheckboxes$3$modifiedRowStyles$1
                                    private final /* synthetic */ Styles $$delegate_0;
                                    final /* synthetic */ TextStyle $selectionRowTextStyle;

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public AppBarStyle getAppBar(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(1105290489);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1105290489, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-appBar> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        AppBarStyle appBar = this.$$delegate_0.getAppBar(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return appBar;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public ButtonStyle getButton(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-621508615);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-621508615, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-button> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        ButtonStyle button = this.$$delegate_0.getButton(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return button;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public ButtonBarStyle getButtonBar(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(1529322104);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1529322104, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-buttonBar> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        ButtonBarStyle buttonBar = this.$$delegate_0.getButtonBar(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return buttonBar;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public CardStackStyle getCardStackStyle(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(991617681);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(991617681, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-cardStackStyle> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        CardStackStyle cardStackStyle = this.$$delegate_0.getCardStackStyle(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return cardStackStyle;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public ChartStyle getChart(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-807939851);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-807939851, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-chart> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        ChartStyle chart = this.$$delegate_0.getChart(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return chart;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public CheckboxStyle getCheckBox(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(466968872);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(466968872, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-checkBox> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        CheckboxStyle checkBox = this.$$delegate_0.getCheckBox(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return checkBox;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(1867117498);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1867117498, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-circularProgressIndicator> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        CircularProgressIndicatorStyle circularProgressIndicator = this.$$delegate_0.getCircularProgressIndicator(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return circularProgressIndicator;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public CommunicationCardStyle getCommunicationCard(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-419410915);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-419410915, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-communicationCard> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        CommunicationCardStyle communicationCard = this.$$delegate_0.getCommunicationCard(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return communicationCard;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-1597959409);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1597959409, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-expandableButtonTray> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        ExpandableButtonTrayStyle expandableButtonTray = this.$$delegate_0.getExpandableButtonTray(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return expandableButtonTray;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public IconButtonStyle getIconButton(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-176435040);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-176435040, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-iconButton> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        IconButtonStyle iconButton = this.$$delegate_0.getIconButton(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return iconButton;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public InfoBannerStyle getInfoBanner(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-110233679);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-110233679, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-infoBanner> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        InfoBannerStyle infoBanner = this.$$delegate_0.getInfoBanner(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return infoBanner;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(400262430);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(400262430, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-loadingPlaceholderStyle> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        LoadingPlaceholderStyle loadingPlaceholderStyle = this.$$delegate_0.getLoadingPlaceholderStyle(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return loadingPlaceholderStyle;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(195282456);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(195282456, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-markdownSpannedText> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        MarkdownSpannedTextStyle markdownSpannedText = this.$$delegate_0.getMarkdownSpannedText(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return markdownSpannedText;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public NavigationBarStyle getNavigationBarStyle(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-238335496);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-238335496, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-navigationBarStyle> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        NavigationBarStyle navigationBarStyle = this.$$delegate_0.getNavigationBarStyle(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return navigationBarStyle;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public NumpadStyle getNumpad(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(1775920862);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1775920862, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-numpad> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        NumpadStyle numpad = this.$$delegate_0.getNumpad(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return numpad;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public PlaceholderStyle getPlaceholder(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-1886544662);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1886544662, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-placeholder> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        PlaceholderStyle placeholder = this.$$delegate_0.getPlaceholder(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return placeholder;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public PogStyle getPog(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-1502348513);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1502348513, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-pog> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        PogStyle pog = this.$$delegate_0.getPog(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return pog;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public ProgressBarStyle getProgressBarStyle(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-474006881);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-474006881, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-progressBarStyle> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        ProgressBarStyle progressBarStyle = this.$$delegate_0.getProgressBarStyle(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return progressBarStyle;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public RadioButtonStyle getRadioButton(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-1326856380);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1326856380, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-radioButton> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        RadioButtonStyle radioButton = this.$$delegate_0.getRadioButton(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return radioButton;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public BentoSelectionRowStyle getSelectionRowStyle(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-1012209845);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1012209845, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-selectionRowStyle> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        BentoSelectionRowStyle selectionRowStyle = this.$$delegate_0.getSelectionRowStyle(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return selectionRowStyle;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public SpanButtonStyle getSpanButton(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-644904177);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-644904177, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-spanButton> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        SpanButtonStyle spanButton = this.$$delegate_0.getSpanButton(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return spanButton;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public com.robinhood.compose.theme.style.TextStyle getText(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(946114238);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(946114238, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-text> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        com.robinhood.compose.theme.style.TextStyle text = this.$$delegate_0.getText(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return text;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public TextButtonStyle getTextButton(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(1525049580);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1525049580, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-textButton> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        TextButtonStyle textButton = this.$$delegate_0.getTextButton(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return textButton;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public TextInputStyle getTextInput(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(1433760532);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1433760532, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-textInput> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        TextInputStyle textInput = this.$$delegate_0.getTextInput(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return textInput;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public ToggleRowStyle getToggleRow(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-1166701059);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1166701059, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-toggleRow> (AgreementAdditionalCheckboxes.kt:0)");
                                        }
                                        ToggleRowStyle toggleRow = this.$$delegate_0.getToggleRow(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return toggleRow;
                                    }

                                    {
                                        this.$selectionRowTextStyle = textM;
                                        this.$$delegate_0 = this.$currentStyles;
                                    }

                                    @Override // com.robinhood.compose.theme.Styles
                                    @JvmName
                                    public RowStyle getRow(Composer composer2, int i9) {
                                        composer2.startReplaceGroup(-2102871439);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2102871439, i9, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<no name provided>.<get-row> (AgreementAdditionalCheckboxes.kt:80)");
                                        }
                                        RowStyle rowStyleCopy$default = RowStyle.copy$default(this.$currentStyles.getRow(composer2, 0), null, RowStyle.Typography.copy$default(this.$currentStyles.getRow(composer2, 0).getTypography(), this.$selectionRowTextStyle, null, null, 6, null), 1, null);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceGroup();
                                        return rowStyleCopy$default;
                                    }
                                }), ComposableLambda3.rememberComposableLambda(-1390333934, true, new AgreementAdditionalCheckboxes3(checkboxes, snapshotStateList2), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier3;
                                textStyle3 = textM;
                                function14 = function152;
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        textStyle3 = textStyle2;
                        function14 = function12;
                        z3 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxesKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AgreementAdditionalCheckboxes.AgreementAdditionalCheckboxes$lambda$10(checkboxes, modifier4, textStyle3, function14, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                z2 = z;
                if ((i3 & 9363) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if ((i2 & 4) == 0) {
                        }
                        if (i4 != 0) {
                        }
                        i6 = i3;
                        function13 = function12;
                        if (i5 == 0) {
                            z3 = z2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final SnapshotStateList snapshotStateList22 = (SnapshotStateList) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        snapshotState4 = (SnapshotState4) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        Boolean boolValueOf22 = Boolean.valueOf(AgreementAdditionalCheckboxes$lambda$7(snapshotState4));
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        if ((i6 & 7168) == 2048) {
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function12 = function1;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z2 = z;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AgreementAdditionalCheckboxes$lambda$7(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AgreementAdditionalCheckboxes$lambda$6$lambda$5(SnapshotStateList snapshotStateList) {
        if (snapshotStateList != null && snapshotStateList.isEmpty()) {
            return true;
        }
        Iterator<T> it = snapshotStateList.iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
