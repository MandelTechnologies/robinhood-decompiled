package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Shadow3;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheet;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import com.robinhood.utils.compose.reorderable.ReorderableListState;
import com.robinhood.utils.compose.reorderable.ReorderableListStateKt;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: AccountSelectorReorderAccountsBottomSheet.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\\\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062'\u0010\u0007\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a%\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\u0010\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u008a\u008e\u0002"}, m3636d2 = {"AccountSelectorReorderAccountsBottomSheet", "", "accountTabs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "onDismiss", "Lkotlin/Function0;", "onOrderChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "newOrder", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ListItem", "tabInfo", "isDragging", "", "locked", "(Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;ZZLandroidx/compose/runtime/Composer;I)V", "feature-account-selector_externalRelease", "updatedOrder"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountSelectorReorderAccountsBottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorReorderAccountsBottomSheet$lambda$11(ImmutableList immutableList, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountSelectorReorderAccountsBottomSheet(immutableList, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem$lambda$13(AccountTabInfo.Account account, boolean z, boolean z2, int i, Composer composer, int i2) {
        ListItem(account, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectorReorderAccountsBottomSheet(final ImmutableList<AccountTabInfo.Account> accountTabs, final Function0<Unit> onDismiss, final Function1<? super List<AccountTabInfo.Account>, Unit> onOrderChanged, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final HapticFeedback hapticFeedback;
        boolean z;
        Object objRememberedValue;
        final List list;
        Object objRememberedValue2;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue4;
        boolean zChangedInstance2;
        Object objRememberedValue5;
        boolean zChangedInstance3;
        Object objRememberedValue6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountTabs, "accountTabs");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onOrderChanged, "onOrderChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1088742497);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(accountTabs) : composerStartRestartGroup.changedInstance(accountTabs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOrderChanged) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1088742497, i3, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheet (AccountSelectorReorderAccountsBottomSheet.kt:57)");
                }
                hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changed(accountTabs));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (AccountTabInfo.Account account : accountTabs) {
                        if (account.isLocked()) {
                            arrayList.add(account);
                        } else {
                            arrayList2.add(account);
                        }
                    }
                    Tuples2 tuples2 = new Tuples2(arrayList, arrayList2);
                    composerStartRestartGroup.updateRememberedValue(tuples2);
                    objRememberedValue = tuples2;
                }
                Tuples2 tuples22 = (Tuples2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                list = (List) tuples22.component1();
                List list2 = (List) tuples22.component2();
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                coroutineScope = (CoroutineScope) objRememberedValue2;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(list2, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                ImmutableList3 persistentList = extensions2.toPersistentList(AccountSelectorReorderAccountsBottomSheet$lambda$3(snapshotState));
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(list);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountSelectorReorderAccountsBottomSheet.AccountSelectorReorderAccountsBottomSheet$lambda$6$lambda$5(coroutineScope, onOrderChanged, list, snapshotState, (List) obj, (Duration) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function2 function2 = (Function2) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                long jM28767getZEROUwyO8pc = Duration.INSTANCE.m28767getZEROUwyO8pc();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(hapticFeedback);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSelectorReorderAccountsBottomSheet.AccountSelectorReorderAccountsBottomSheet$lambda$8$lambda$7(hapticFeedback);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function0 function0 = (Function0) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(hapticFeedback);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSelectorReorderAccountsBottomSheet.AccountSelectorReorderAccountsBottomSheet$lambda$10$lambda$9(hapticFeedback);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                final ReorderableListState reorderableListStateM26636rememberReorderableListStateKVH2U2I = ReorderableListStateKt.m26636rememberReorderableListStateKVH2U2I(persistentList, function2, jM28767getZEROUwyO8pc, function0, (Function0) objRememberedValue6, composerStartRestartGroup, AccountTabInfo.Account.$stable, 0);
                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(359615933, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt.AccountSelectorReorderAccountsBottomSheet.2

                    /* compiled from: AccountSelectorReorderAccountsBottomSheet.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$AccountSelectorReorderAccountsBottomSheet$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ List<AccountTabInfo.Account> $lockedAccounts;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Function0<Unit> $onDismiss;
                        final /* synthetic */ ReorderableListState<AccountTabInfo.Account> $reorderListState;

                        AnonymousClass1(Modifier modifier, List<AccountTabInfo.Account> list, ReorderableListState<AccountTabInfo.Account> reorderableListState, Function0<Unit> function0) {
                            this.$modifier = modifier;
                            this.$lockedAccounts = list;
                            this.$reorderListState = reorderableListState;
                            this.$onDismiss = function0;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-107740984, i, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheet.<anonymous>.<anonymous> (AccountSelectorReorderAccountsBottomSheet.kt:84)");
                            }
                            Modifier modifier = this.$modifier;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifier, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            List<AccountTabInfo.Account> list = this.$lockedAccounts;
                            final ReorderableListState<AccountTabInfo.Account> reorderableListState = this.$reorderListState;
                            Function0<Unit> function0 = this.$onDismiss;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String strStringResource = StringResources_androidKt.stringResource(C26457R.string.reorder_accounts_title, composer, 0);
                            TextStyle textL = bentoTheme.getTypography(composer, i2).getTextL();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textL, composer, 24624, 0, 8108);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
                            composer.startReplaceGroup(46429934);
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                AccountSelectorReorderAccountsBottomSheet.ListItem((AccountTabInfo.Account) it.next(), false, true, composer, AccountTabInfo.Account.$stable | 432);
                            }
                            composer.endReplaceGroup();
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierNestedScroll$default = NestedScrollModifier7.nestedScroll$default(companion3, NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer, 0, 1), null, 2, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(reorderableListState);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$AccountSelectorReorderAccountsBottomSheet$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AccountSelectorReorderAccountsBottomSheet.C264482.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2(reorderableListState, (ReorderableLazyListScope) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            ReorderableLazyColumnKt.ReorderableLazyColumn(modifierNestedScroll$default, null, null, false, null, null, null, false, (Function1) objRememberedValue, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                            BentoButtons.Type type2 = BentoButtons.Type.Primary;
                            Modifier modifierTestTag = TestTag3.testTag(companion3, BentoButtonBar2.BentoButtonBarTestTagPrimaryButton);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C26457R.string.close_button, composer, 0), SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, 0.0f, bentoTheme2.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), null, type2, false, false, null, null, null, null, false, null, composer, 1597440, 0, 8104);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3$lambda$2(ReorderableListState reorderableListState, ReorderableLazyListScope ReorderableLazyColumn) {
                            Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
                            ReorderableListStateKt.reorderableItems$default(ReorderableLazyColumn, reorderableListState, "account-tab", new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$AccountSelectorReorderAccountsBottomSheet$2$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AccountSelectorReorderAccountsBottomSheet.C264482.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2$lambda$1(((Integer) obj).intValue(), (AccountTabInfo.Account) obj2);
                                }
                            }, null, false, false, AccountSelectorReorderAccountsBottomSheet3.INSTANCE.m17950getLambda$1957854472$feature_account_selector_externalRelease(), 56, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final String invoke$lambda$4$lambda$3$lambda$2$lambda$1(int i, AccountTabInfo.Account item) {
                            Intrinsics.checkNotNullParameter(item, "item");
                            return item.getId();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(359615933, i5, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheet.<anonymous> (AccountSelectorReorderAccountsBottomSheet.kt:83)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-107740984, true, new AnonymousClass1(modifier4, list, reorderableListStateM26636rememberReorderableListStateKVH2U2I, onDismiss), composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSelectorReorderAccountsBottomSheet.AccountSelectorReorderAccountsBottomSheet$lambda$11(accountTabs, onDismiss, onOrderChanged, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) != 4) {
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList22 = new ArrayList();
                    while (r14.hasNext()) {
                    }
                    Tuples2 tuples23 = new Tuples2(arrayList3, arrayList22);
                    composerStartRestartGroup.updateRememberedValue(tuples23);
                    objRememberedValue = tuples23;
                    Tuples2 tuples222 = (Tuples2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    list = (List) tuples222.component1();
                    List list22 = (List) tuples222.component2();
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue2;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    ImmutableList3 persistentList2 = extensions2.toPersistentList(AccountSelectorReorderAccountsBottomSheet$lambda$3(snapshotState));
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(list);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue4 = new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AccountSelectorReorderAccountsBottomSheet.AccountSelectorReorderAccountsBottomSheet$lambda$6$lambda$5(coroutineScope, onOrderChanged, list, snapshotState, (List) obj, (Duration) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        Function2 function22 = (Function2) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        long jM28767getZEROUwyO8pc2 = Duration.INSTANCE.m28767getZEROUwyO8pc();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(hapticFeedback);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AccountSelectorReorderAccountsBottomSheet.AccountSelectorReorderAccountsBottomSheet$lambda$8$lambda$7(hapticFeedback);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            Function0 function02 = (Function0) objRememberedValue5;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChangedInstance3 = composerStartRestartGroup.changedInstance(hapticFeedback);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance3) {
                                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AccountSelectorReorderAccountsBottomSheet.AccountSelectorReorderAccountsBottomSheet$lambda$10$lambda$9(hapticFeedback);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                composerStartRestartGroup.endReplaceGroup();
                                final ReorderableListState<AccountTabInfo.Account> reorderableListStateM26636rememberReorderableListStateKVH2U2I2 = ReorderableListStateKt.m26636rememberReorderableListStateKVH2U2I(persistentList2, function22, jM28767getZEROUwyO8pc2, function02, (Function0) objRememberedValue6, composerStartRestartGroup, AccountTabInfo.Account.$stable, 0);
                                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(359615933, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt.AccountSelectorReorderAccountsBottomSheet.2

                                    /* compiled from: AccountSelectorReorderAccountsBottomSheet.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$AccountSelectorReorderAccountsBottomSheet$2$1, reason: invalid class name */
                                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                        final /* synthetic */ List<AccountTabInfo.Account> $lockedAccounts;
                                        final /* synthetic */ Modifier $modifier;
                                        final /* synthetic */ Function0<Unit> $onDismiss;
                                        final /* synthetic */ ReorderableListState<AccountTabInfo.Account> $reorderListState;

                                        AnonymousClass1(Modifier modifier, List<AccountTabInfo.Account> list, ReorderableListState<AccountTabInfo.Account> reorderableListState, Function0<Unit> function0) {
                                            this.$modifier = modifier;
                                            this.$lockedAccounts = list;
                                            this.$reorderListState = reorderableListState;
                                            this.$onDismiss = function0;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                            invoke(composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer, int i) {
                                            if ((i & 3) == 2 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-107740984, i, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheet.<anonymous>.<anonymous> (AccountSelectorReorderAccountsBottomSheet.kt:84)");
                                            }
                                            Modifier modifier = this.$modifier;
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i2 = BentoTheme.$stable;
                                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifier, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null);
                                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                            List<AccountTabInfo.Account> list = this.$lockedAccounts;
                                            final ReorderableListState reorderableListState = this.$reorderListState;
                                            Function0<Unit> function0 = this.$onDismiss;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            if (composer.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer.startReusableNode();
                                            if (composer.getInserting()) {
                                                composer.createNode(constructor);
                                            } else {
                                                composer.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            String strStringResource = StringResources_androidKt.stringResource(C26457R.string.reorder_accounts_title, composer, 0);
                                            TextStyle textL = bentoTheme.getTypography(composer, i2).getTextL();
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            BentoText2.m20747BentoText38GnDrw(strStringResource, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textL, composer, 24624, 0, 8108);
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
                                            composer.startReplaceGroup(46429934);
                                            Iterator<T> it = list.iterator();
                                            while (it.hasNext()) {
                                                AccountSelectorReorderAccountsBottomSheet.ListItem((AccountTabInfo.Account) it.next(), false, true, composer, AccountTabInfo.Account.$stable | 432);
                                            }
                                            composer.endReplaceGroup();
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            Modifier modifierNestedScroll$default = NestedScrollModifier7.nestedScroll$default(companion3, NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer, 0, 1), null, 2, null);
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged = composer.changed(reorderableListState);
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$AccountSelectorReorderAccountsBottomSheet$2$1$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return AccountSelectorReorderAccountsBottomSheet.C264482.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2(reorderableListState, (ReorderableLazyListScope) obj);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            ReorderableLazyColumnKt.ReorderableLazyColumn(modifierNestedScroll$default, null, null, false, null, null, null, false, (Function1) objRememberedValue, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                                            BentoButtons.Type type2 = BentoButtons.Type.Primary;
                                            Modifier modifierTestTag = TestTag3.testTag(companion3, BentoButtonBar2.BentoButtonBarTestTagPrimaryButton);
                                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                            int i3 = BentoTheme.$stable;
                                            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C26457R.string.close_button, composer, 0), SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, 0.0f, bentoTheme2.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), null, type2, false, false, null, null, null, null, false, null, composer, 1597440, 0, 8104);
                                            composer.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$4$lambda$3$lambda$2(ReorderableListState reorderableListState, ReorderableLazyListScope ReorderableLazyColumn) {
                                            Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
                                            ReorderableListStateKt.reorderableItems$default(ReorderableLazyColumn, reorderableListState, "account-tab", new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$AccountSelectorReorderAccountsBottomSheet$2$1$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return AccountSelectorReorderAccountsBottomSheet.C264482.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2$lambda$1(((Integer) obj).intValue(), (AccountTabInfo.Account) obj2);
                                                }
                                            }, null, false, false, AccountSelectorReorderAccountsBottomSheet3.INSTANCE.m17950getLambda$1957854472$feature_account_selector_externalRelease(), 56, null);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final String invoke$lambda$4$lambda$3$lambda$2$lambda$1(int i, AccountTabInfo.Account item) {
                                            Intrinsics.checkNotNullParameter(item, "item");
                                            return item.getId();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i5) {
                                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(359615933, i5, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheet.<anonymous> (AccountSelectorReorderAccountsBottomSheet.kt:83)");
                                        }
                                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-107740984, true, new AnonymousClass1(modifier4, list, reorderableListStateM26636rememberReorderableListStateKVH2U2I2, onDismiss), composer2, 54), composer2, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier4;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job AccountSelectorReorderAccountsBottomSheet$lambda$6$lambda$5(CoroutineScope coroutineScope, Function1 function1, List list, SnapshotState snapshotState, List newTabs, Duration duration) {
        Intrinsics.checkNotNullParameter(newTabs, "newTabs");
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AccountSelectorReorderAccountsBottomSheet2(newTabs, function1, list, snapshotState, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorReorderAccountsBottomSheet$lambda$8$lambda$7(HapticFeedback hapticFeedback) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorReorderAccountsBottomSheet$lambda$10$lambda$9(HapticFeedback hapticFeedback) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        return Unit.INSTANCE;
    }

    private static final List<AccountTabInfo.Account> AccountSelectorReorderAccountsBottomSheet$lambda$3(SnapshotState<List<AccountTabInfo.Account>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListItem(final AccountTabInfo.Account account, final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        Modifier modifierM4872backgroundbw27NRU$default;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-250263452);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(account) : composerStartRestartGroup.changedInstance(account) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-250263452, i2, -1, "com.robinhood.android.redesign.feature.accounttab.ListItem (AccountSelectorReorderAccountsBottomSheet.kt:146)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(464878637);
                modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Shadow3.m6468shadows4CzXII$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(1), null, false, 0L, 0L, 30, null), Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(464994949);
                modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierM4872backgroundbw27NRU$default, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(12));
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            if (z2) {
                serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.LOCK_24;
            } else {
                serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.DRAG_24;
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2), null, bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 56);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            BentoText2.m20747BentoText38GnDrw(StringResources6.getText(account.getDisplayName(), composerStartRestartGroup, StringResource.$stable).toString(), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getNormal(), null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 805330992, 0, 7656);
            composerStartRestartGroup = composerStartRestartGroup;
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectorReorderAccountsBottomSheet.ListItem$lambda$13(account, z, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
