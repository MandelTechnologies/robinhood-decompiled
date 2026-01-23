package com.truelayer.payments.p419ui.screens.account;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.Delete2;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButton5;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.BackHandler;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.truelayer.payments.core.domain.payments.UserAccount;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.BackButton;
import com.truelayer.payments.p419ui.components.EncircledProviderImage4;
import com.truelayer.payments.p419ui.components.ItemDivider;
import com.truelayer.payments.p419ui.components.ScreenTitle;
import com.truelayer.payments.p419ui.components.toolbars.AccessibleTopAppBar2;
import com.truelayer.payments.p419ui.screens.components.BankUnavailableDialog;
import com.truelayer.payments.p419ui.screens.components.ErrorDialog6;
import com.truelayer.payments.p419ui.screens.providerselection.PaymentProviderViewData3;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.theme.Theme5;
import com.truelayer.payments.p419ui.utils.TestTags;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: AccountSelection.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001ae\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\r\u001a9\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u008a\u008e\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u008a\u008e\u0002"}, m3636d2 = {"AccountSelection", "", "accounts", "", "Lcom/truelayer/payments/core/domain/payments/UserAccount;", "onSelect", "Lkotlin/Function1;", "onDelete", "onNewAccount", "Lkotlin/Function0;", "onAbort", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AccountSelectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "DeleteAccountConfirmationDialog", "account", "(Lcom/truelayer/payments/core/domain/payments/UserAccount;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release", "deleteAccountDialog", "showUnavailableBankDialogWithName"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AccountSelectionKt {
    public static final void AccountSelection(final List<UserAccount> accounts2, Function1<? super UserAccount, Unit> function1, Function1<? super UserAccount, Unit> function12, Function0<Unit> function0, final Function0<Unit> onAbort, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(onAbort, "onAbort");
        Composer composerStartRestartGroup = composer.startRestartGroup(1355153935);
        final Function1<? super UserAccount, Unit> function13 = (i2 & 2) != 0 ? new Function1<UserAccount, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt.AccountSelection.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(UserAccount it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserAccount userAccount) {
                invoke2(userAccount);
                return Unit.INSTANCE;
            }
        } : function1;
        final Function1<? super UserAccount, Unit> function14 = (i2 & 4) != 0 ? new Function1<UserAccount, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt.AccountSelection.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(UserAccount it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserAccount userAccount) {
                invoke2(userAccount);
                return Unit.INSTANCE;
            }
        } : function12;
        final Function0<Unit> function02 = (i2 & 8) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt.AccountSelection.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1355153935, i, -1, "com.truelayer.payments.ui.screens.account.AccountSelection (AccountSelection.kt:73)");
        }
        composerStartRestartGroup.startReplaceableGroup(-598791743);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-598791637);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-598791560);
        boolean z = (((57344 & i) ^ 24576) > 16384 && composerStartRestartGroup.changed(onAbort)) || (i & 24576) == 16384;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    onAbort.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        BackHandler.BackHandler(false, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 1);
        final Function1<? super UserAccount, Unit> function15 = function13;
        final Function0<Unit> function03 = function02;
        ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.composableLambda(composerStartRestartGroup, 2070106323, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt.AccountSelection.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2070106323, i3, -1, "com.truelayer.payments.ui.screens.account.AccountSelection.<anonymous> (AccountSelection.kt:88)");
                    }
                    String strStringResource = StringResources_androidKt.stringResource(C42830R.string.account_selection_title, composer2, 0);
                    final Function0<Unit> function04 = onAbort;
                    AccessibleTopAppBar2.AccessibleTopAppBar(null, strStringResource, ComposableLambda3.composableLambda(composer2, 377624247, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt.AccountSelection.5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(377624247, i4, -1, "com.truelayer.payments.ui.screens.account.AccountSelection.<anonymous>.<anonymous> (AccountSelection.kt:90)");
                            }
                            BackButton.BackButton(null, null, function04, composer3, 0, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), null, composer2, 384, 9);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), null, null, null, 0, 0L, 0L, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1032366306, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt.AccountSelection.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) throws Resources.NotFoundException {
                invoke(paddingValues, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues padding, Composer composer2, int i3) throws Resources.NotFoundException {
                int i4;
                Intrinsics.checkNotNullParameter(padding, "padding");
                if ((i3 & 14) == 0) {
                    i4 = i3 | (composer2.changed(padding) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i4 & 91) != 18 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1032366306, i4, -1, "com.truelayer.payments.ui.screens.account.AccountSelection.<anonymous> (AccountSelection.kt:94)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), padding);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                    final List<UserAccount> list = accounts2;
                    final Function1<UserAccount, Unit> function16 = function13;
                    final SnapshotState<UserAccount> snapshotState3 = snapshotState2;
                    final SnapshotState<UserAccount> snapshotState4 = snapshotState;
                    final Function0<Unit> function04 = function02;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Column6 column6 = Column6.INSTANCE;
                    final String strStringResource = StringResources_androidKt.stringResource(C42830R.string.accessibility_number_of_items_in_list, new Object[]{StringResources_androidKt.pluralStringResource(C42830R.plurals.items, list.size(), new Object[]{Integer.valueOf(list.size())}, composer2, 512)}, composer2, 64);
                    ScreenTitle.ScreenTitle(StringResources_androidKt.stringResource(C42830R.string.account_selection_title, composer2, 0), null, composer2, 0, 2);
                    Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
                    composer2.startReplaceableGroup(398020798);
                    boolean zChanged = composer2.changed(strStringResource);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$6$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                SemanticsPropertiesKt.setContentDescription(semantics, strStringResource);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    LazyDslKt.LazyColumn(SemanticsModifier6.semantics$default(companion2, false, (Function1) objRememberedValue4, 1, null), null, null, false, null, centerHorizontally2, null, false, new Function1<LazyListScope, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$6$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                            invoke2(lazyListScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LazyListScope LazyColumn) {
                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                            final List<UserAccount> list2 = list;
                            final Function1<UserAccount, Unit> function17 = function16;
                            final SnapshotState<UserAccount> snapshotState5 = snapshotState3;
                            final SnapshotState<UserAccount> snapshotState6 = snapshotState4;
                            final C42938xcff726dd c42938xcff726dd = new Function1() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$6$1$2$invoke$$inlined$items$default$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Void invoke(UserAccount userAccount) {
                                    return null;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke((UserAccount) obj);
                                }
                            };
                            LazyColumn.items(list2.size(), null, new Function1<Integer, Object>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$6$1$2$invoke$$inlined$items$default$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                public final Object invoke(int i5) {
                                    return c42938xcff726dd.invoke(list2.get(i5));
                                }
                            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$6$1$2$invoke$$inlined$items$default$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                    invoke(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope lazyItemScope, int i5, Composer composer3, int i6) {
                                    int i7;
                                    if ((i6 & 14) == 0) {
                                        i7 = i6 | (composer3.changed(lazyItemScope) ? 4 : 2);
                                    } else {
                                        i7 = i6;
                                    }
                                    if ((i6 & 112) == 0) {
                                        i7 |= composer3.changed(i5) ? 32 : 16;
                                    }
                                    if ((i7 & 731) == 146 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-632812321, i7, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                    }
                                    final UserAccount userAccount = (UserAccount) list2.get(i5);
                                    final float f = userAccount.getProvider().isAvailable() ? 1.0f : 0.48f;
                                    Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(88), 1, null), 0.0f, 1, null), TestTags.PROVIDER_ROW);
                                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                                    int i8 = CardDefaults.$stable;
                                    CardElevation cardElevationM5730cardElevationaqJV_2Y = cardDefaults.m5730cardElevationaqJV_2Y(fM7995constructorimpl, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, (i8 << 18) | 6, 62);
                                    Color.Companion companion5 = Color.INSTANCE;
                                    CardColors cardColorsM5729cardColorsro_MJ88 = cardDefaults.m5729cardColorsro_MJ88(companion5.m6725getTransparent0d7_KjU(), 0L, companion5.m6725getTransparent0d7_KjU(), 0L, composer3, (i8 << 12) | 390, 10);
                                    CornerBasedShape medium = MaterialTheme.INSTANCE.getShapes(composer3, MaterialTheme.$stable).getMedium();
                                    final Function1 function18 = function17;
                                    final SnapshotState snapshotState7 = snapshotState5;
                                    Function0<Unit> function05 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$6$1$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (userAccount.getProvider().isAvailable()) {
                                                function18.invoke(userAccount);
                                            } else {
                                                snapshotState7.setValue(userAccount);
                                            }
                                        }
                                    };
                                    final SnapshotState snapshotState8 = snapshotState6;
                                    CardKt.Card(function05, modifierTestTag, false, medium, cardColorsM5729cardColorsro_MJ88, cardElevationM5730cardElevationaqJV_2Y, null, null, ComposableLambda3.composableLambda(composer3, 239367939, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$6$1$2$1$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer4, Integer num) throws Resources.NotFoundException {
                                            invoke(column5, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Column5 Card, Composer composer4, int i9) throws Resources.NotFoundException {
                                            String str;
                                            int i10;
                                            Composer composer5;
                                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                            if ((i9 & 81) == 16 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(239367939, i9, -1, "com.truelayer.payments.ui.screens.account.AccountSelection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountSelection.kt:131)");
                                            }
                                            Modifier.Companion companion6 = Modifier.INSTANCE;
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                                            Spacing spacing = Spacing.INSTANCE;
                                            Modifier modifierAlpha = Alpha.alpha(PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default, spacing.m27177getREGULARD9Ej5fM()), f);
                                            Alignment.Companion companion7 = Alignment.INSTANCE;
                                            Alignment.Vertical centerVertically = companion7.getCenterVertically();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                            final UserAccount userAccount2 = userAccount;
                                            final SnapshotState<UserAccount> snapshotState9 = snapshotState8;
                                            composer4.startReplaceableGroup(693286680);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(spaceBetween, centerVertically, composer4, 54);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor2 = companion8.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlpha);
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion8.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion8.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion8.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            Row6 row6 = Row6.INSTANCE;
                                            final String strStringResource2 = StringResources_androidKt.stringResource(C42830R.string.account_selection_masked_account, new Object[]{StringsKt.replace$default(userAccount2.getMaskedAccountIdentifier(), "*", "", false, 4, (Object) null)}, composer4, 64);
                                            Modifier modifierWeight$default = Row5.weight$default(row6, companion6, 2.0f, false, 2, null);
                                            Alignment.Vertical centerVertically2 = companion7.getCenterVertically();
                                            composer4.startReplaceableGroup(693286680);
                                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer4, 48);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor3);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion8.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion8.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion8.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            EncircledProviderImage4.m27040EncircledProviderImageuFdPcIQ(null, C2002Dp.m7995constructorimpl(56), PaymentProviderViewData3.intoViewData(userAccount2.getProvider(), false), composer4, 560, 1);
                                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion6, spacing.m27177getREGULARD9Ej5fM()), composer4, 6);
                                            composer4.startReplaceableGroup(-483455358);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion7.getStart(), composer4, 0);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion6);
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor4);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion8.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion8.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion8.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                            }
                                            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            Column6 column62 = Column6.INSTANCE;
                                            String displayName = userAccount2.getProvider().getDisplayName();
                                            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                            int i11 = MaterialTheme.$stable;
                                            TextKt.m6028Text4IGK_g(displayName, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i11).getBodyLarge(), composer4, 0, 0, 65534);
                                            if (userAccount2.getProvider().isAvailable()) {
                                                composer4.startReplaceableGroup(87678896);
                                                composer4.startReplaceableGroup(87678976);
                                                boolean zChanged2 = composer4.changed(strStringResource2);
                                                Object objRememberedValue5 = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue5 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$6$1$2$1$2$1$1$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            invoke2(semanticsPropertyReceiver);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                                                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                            SemanticsPropertiesKt.setContentDescription(semantics, strStringResource2);
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(objRememberedValue5);
                                                }
                                                composer4.endReplaceableGroup();
                                                str = strStringResource2;
                                                i10 = 0;
                                                TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.account_selection_masked_account, new Object[]{userAccount2.getMaskedAccountIdentifier()}, composer4, 64), SemanticsModifier6.semantics$default(companion6, false, (Function1) objRememberedValue5, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i11).getBodySmall(), composer4, 0, 0, 65532);
                                                composer5 = composer4;
                                                composer5.endReplaceableGroup();
                                            } else {
                                                str = strStringResource2;
                                                i10 = 0;
                                                composer4.startReplaceableGroup(87679613);
                                                TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.bank_temporarily_unavailable, composer4, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i11).getBodySmall(), composer4, 0, 0, 65534);
                                                composer5 = composer4;
                                                composer5.endReplaceableGroup();
                                            }
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion6, C2002Dp.m7995constructorimpl(48));
                                            Function0<Unit> function06 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$6$1$2$1$2$1$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    snapshotState9.setValue(userAccount2);
                                                }
                                            };
                                            final String str2 = str;
                                            IconButton5.IconButton(function06, modifierM5169size3ABfNKs, false, null, null, ComposableLambda3.composableLambda(composer5, -2069795486, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$6$1$2$1$2$1$3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                    invoke(composer6, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer6, int i12) {
                                                    if ((i12 & 11) != 2 || !composer6.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-2069795486, i12, -1, "com.truelayer.payments.ui.screens.account.AccountSelection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountSelection.kt:181)");
                                                        }
                                                        IconKt.m5872Iconww6aTOc(Delete2.getDelete(Icons.Outlined.INSTANCE), StringResources_androidKt.stringResource(C42830R.string.account_selection_remove_button, composer6, 0) + PlaceholderUtils.XXShortPlaceholderText + userAccount2.getProvider().getDisplayName() + str2, (Modifier) null, 0L, composer6, 0, 12);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer6.skipToGroupEnd();
                                                }
                                            }), composer4, 196656, 28);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            ItemDivider.ItemDivider(composer4, i10);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer3, 100663344, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                            final Function0<Unit> function05 = function04;
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(104010964, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$6$1$2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer3, Integer num) {
                                    invoke(lazyItemScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope item, Composer composer3, int i5) {
                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                    if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(104010964, i5, -1, "com.truelayer.payments.ui.screens.account.AccountSelection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountSelection.kt:191)");
                                        }
                                        ButtonKt.TextButton(function05, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Spacing.INSTANCE.m27177getREGULARD9Ej5fM(), 1, null), false, null, null, null, null, null, null, ComposableSingletons$AccountSelectionKt.INSTANCE.m27090getLambda1$payments_ui_release(), composer3, 805306416, 508);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), 3, null);
                        }
                    }, composer2, 196608, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 805306416, 509);
        UserAccount userAccountAccountSelection$lambda$1 = AccountSelection$lambda$1(snapshotState);
        composerStartRestartGroup.startReplaceableGroup(-598785638);
        if (userAccountAccountSelection$lambda$1 != null) {
            composerStartRestartGroup.startReplaceableGroup(-793319373);
            boolean z2 = (((i & 896) ^ 384) > 256 && composerStartRestartGroup.changed(function14)) || (i & 384) == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1<UserAccount, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$7$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(UserAccount userAccount) {
                        invoke2(userAccount);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(UserAccount it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        function14.invoke(it);
                        snapshotState.setValue(null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function1 function16 = (Function1) objRememberedValue4;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-793319262);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$7$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        snapshotState.setValue(null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            DeleteAccountConfirmationDialog(userAccountAccountSelection$lambda$1, function16, (Function0) objRememberedValue5, composerStartRestartGroup, 392, 0);
            Unit unit = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        UserAccount userAccountAccountSelection$lambda$4 = AccountSelection$lambda$4(snapshotState2);
        if (userAccountAccountSelection$lambda$4 != null) {
            EffectsKt.LaunchedEffect(userAccountAccountSelection$lambda$4, new AccountSelectionKt$AccountSelection$8$1(userAccountAccountSelection$lambda$4, null), composerStartRestartGroup, 72);
            String displayName = userAccountAccountSelection$lambda$4.getProvider().getDisplayName();
            composerStartRestartGroup.startReplaceableGroup(-793318728);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt$AccountSelection$8$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        snapshotState2.setValue(null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BankUnavailableDialog.BankUnavailableDialog(displayName, null, (Function0) objRememberedValue6, composerStartRestartGroup, 384, 2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt.AccountSelection.9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    AccountSelectionKt.AccountSelection(accounts2, function15, function14, function03, onAbort, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void DeleteAccountConfirmationDialog(final UserAccount account, Function1<? super UserAccount, Unit> function1, final Function0<Unit> onAbort, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(onAbort, "onAbort");
        Composer composerStartRestartGroup = composer.startRestartGroup(1739515048);
        final Function1<? super UserAccount, Unit> function12 = (i2 & 2) != 0 ? new Function1<UserAccount, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt.DeleteAccountConfirmationDialog.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(UserAccount it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserAccount userAccount) {
                invoke2(userAccount);
                return Unit.INSTANCE;
            }
        } : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1739515048, i, -1, "com.truelayer.payments.ui.screens.account.DeleteAccountConfirmationDialog (AccountSelection.kt:238)");
        }
        ErrorDialog6.ErrorDialog(StringResources_androidKt.stringResource(C42830R.string.account_selection_delete_dialog_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C42830R.string.account_selection_delete_dialog_message, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C42830R.string.account_selection_cancel_button, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C42830R.string.account_selection_remove_button, composerStartRestartGroup, 0), onAbort, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt.DeleteAccountConfirmationDialog.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                function12.invoke(account);
            }
        }, false, false, composerStartRestartGroup, (i << 6) & 57344, 192);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt.DeleteAccountConfirmationDialog.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    AccountSelectionKt.DeleteAccountConfirmationDialog(account, function12, onAbort, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void AccountSelectionPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(546601649);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(546601649, i, -1, "com.truelayer.payments.ui.screens.account.AccountSelectionPreview (AccountSelection.kt:261)");
            }
            Theme5.Theme(null, false, null, ComposableSingletons$AccountSelectionKt.INSTANCE.m27091getLambda2$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.account.AccountSelectionKt.AccountSelectionPreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    AccountSelectionKt.AccountSelectionPreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final UserAccount AccountSelection$lambda$1(SnapshotState<UserAccount> snapshotState) {
        return snapshotState.getValue();
    }

    private static final UserAccount AccountSelection$lambda$4(SnapshotState<UserAccount> snapshotState) {
        return snapshotState.getValue();
    }
}
