package com.robinhood.android.lib.accountswitcher;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.lib.accountswitcher.AccountSwitcher5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AccountSwitcher.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\t\u001a?\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a1\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"AccountSwitcherRowEnd", "", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "metadataPrimaryText", "", "metadataSecondaryText", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountSwitcherRow", "state", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData;", "activeAccountContext", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "selectedAccountNumber", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData;Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AccountSwitcher", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "callbacks", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherCallbacks;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "lib-account-switcher_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class AccountSwitcher5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSwitcher$lambda$9(AccountSwitcherData accountSwitcherData, AccountSwitcherCallbacks accountSwitcherCallbacks, Modifier modifier, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        AccountSwitcher(accountSwitcherData, accountSwitcherCallbacks, modifier, paddingValues, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSwitcherRow$lambda$2(AccountSwitcherRowData accountSwitcherRowData, BrokerageAccountContext brokerageAccountContext, String str, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        AccountSwitcherRow(accountSwitcherRowData, brokerageAccountContext, str, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSwitcherRowEnd$lambda$1(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountSwitcherRowEnd(serverToBentoAssetMapper2, str, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSwitcherRowEnd(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, final String str, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier4;
        final ServerToBentoAssetMapper2 serverToBentoAssetMapper22;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-794301882);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(serverToBentoAssetMapper2.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-794301882, i3, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherRowEnd (AccountSwitcher.kt:34)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getEnd(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                if (str == null && !StringsKt.isBlank(str)) {
                    composerStartRestartGroup.startReplaceGroup(1844708791);
                    int i5 = i3;
                    modifier4 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i3 >> 3) & 14, 0, 16382);
                    if (str2 != null && !StringsKt.isBlank(str2)) {
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, (i5 >> 6) & 14, 0, 8186);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                } else {
                    modifier4 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(1845073134);
                    serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper22), null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 56);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                modifier5 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSwitcher5.AccountSwitcherRowEnd$lambda$1(serverToBentoAssetMapper22, str, str2, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getEnd(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                if (str == null) {
                    modifier4 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(1845073134);
                    serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper22), null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 56);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier5 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSwitcherRow(final AccountSwitcherRowData state, final BrokerageAccountContext activeAccountContext, final String str, Modifier modifier, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activeAccountContext, "activeAccountContext");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1018271609);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(activeAccountContext) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClick) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1018271609, i3, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherRow (AccountSwitcher.kt:68)");
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), AccountSwitcherUtils2.toLoggingDescriptor(state, activeAccountContext)), true, false, false, true, false, null, 108, null);
                Modifier modifier5 = modifier4;
                if (!(state instanceof AccountSwitcherRowData.Account)) {
                    composerStartRestartGroup.startReplaceGroup(25081679);
                    int i5 = i3;
                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                    AccountSwitcherRowData.Account account = (AccountSwitcherRowData.Account) state;
                    StringResource primaryText = account.getPrimaryText();
                    int i6 = StringResource.$stable;
                    String textAsString = StringResources6.getTextAsString(primaryText, composerStartRestartGroup, i6);
                    StringResource secondaryText = account.getSecondaryText();
                    composerStartRestartGroup.startReplaceGroup(693552376);
                    String textAsString2 = secondaryText == null ? null : StringResources6.getTextAsString(secondaryText, composerStartRestartGroup, i6);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoSelectionRow2.BentoSelectionRow(modifierAutoLogEvents$default, type2, textAsString, Intrinsics.areEqual(account.getId(), str), textAsString2, account.getEnabled(), new BentoSelectionRowState.IconPosition.Leading(ComposableLambda3.rememberComposableLambda(612257708, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt.AccountSwitcherRow.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(612257708, i7, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherRow.<anonymous> (AccountSwitcher.kt:87)");
                            }
                            AccountSwitcher5.AccountSwitcherRowEnd(((AccountSwitcherRowData.Account) state).getIcon(), ((AccountSwitcherRowData.Account) state).getMetadataPrimaryText(), ((AccountSwitcherRowData.Account) state).getMetadataSecondaryText(), null, composer2, 0, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54)), false, false, false, onClick, composerStartRestartGroup, (BentoSelectionRowState.IconPosition.Leading.$stable << 18) | 48, (i5 >> 12) & 14, 896);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    int i7 = i3;
                    if (!(state instanceof AccountSwitcherRowData.PendingApplication)) {
                        composerStartRestartGroup.startReplaceGroup(693544655);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(25910619);
                    AccountSwitcherRowData.PendingApplication pendingApplication = (AccountSwitcherRowData.PendingApplication) state;
                    BentoSelectionRow2.BentoSelectionRow(modifierAutoLogEvents$default, BentoSelectionRowState.Type.RadioButton, pendingApplication.getPrimaryText(), Intrinsics.areEqual(pendingApplication.getId(), str), pendingApplication.getSecondaryText(), pendingApplication.getEnabled(), new BentoSelectionRowState.IconPosition.Leading(ComposableLambda3.rememberComposableLambda(815441502, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt.AccountSwitcherRow.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(815441502, i8, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcherRow.<anonymous> (AccountSwitcher.kt:106)");
                            }
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(((AccountSwitcherRowData.PendingApplication) state).getIcon()), null, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer2, BentoIcon4.Size24.$stable | 48, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54)), false, false, false, onClick, composerStartRestartGroup, (BentoSelectionRowState.IconPosition.Leading.$stable << 18) | 48, (i7 >> 12) & 14, 896);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSwitcher5.AccountSwitcherRow$lambda$2(state, activeAccountContext, str, modifier3, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), AccountSwitcherUtils2.toLoggingDescriptor(state, activeAccountContext)), true, false, false, true, false, null, 108, null);
            Modifier modifier52 = modifier4;
            if (!(state instanceof AccountSwitcherRowData.Account)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSwitcher(final AccountSwitcherData state, final AccountSwitcherCallbacks callbacks, Modifier modifier, PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        PaddingValues paddingValues2;
        final String title;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean zChanged;
        Object objRememberedValue3;
        final Modifier modifier3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1412205013);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    paddingValues2 = paddingValues;
                    i3 |= composerStartRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    PaddingValues paddingValuesM5135PaddingValues0680j_4 = i4 == 0 ? PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)) : paddingValues2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1412205013, i3, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcher (AccountSwitcher.kt:124)");
                    }
                    title = state.getTitle();
                    composerStartRestartGroup.startReplaceGroup(80655378);
                    if (title == null) {
                        title = StringResources_androidKt.stringResource(C20198R.string.account_switcher_fallback_title, composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AccountSwitcherData.ActiveSelection activeSelection = state.getActiveSelection();
                    AccountSwitcherData.ActiveSelection.AccountRow accountRow = !(activeSelection instanceof AccountSwitcherData.ActiveSelection.AccountRow) ? (AccountSwitcherData.ActiveSelection.AccountRow) activeSelection : null;
                    String accountNumber = accountRow == null ? accountRow.getAccountNumber() : null;
                    ImmutableList immutableList = extensions2.toImmutableList(state.getRows());
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AccountSwitcher5.AccountSwitcher$lambda$4$lambda$3((AccountSwitcherRowData) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(state);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(AccountSwitcher5.AccountSwitcher$lambda$6$lambda$5(state, ((Integer) obj).intValue()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function12 = (Function1) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged = composerStartRestartGroup.changed(title) | composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(callbacks);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AccountSwitcher5.AccountSwitcher$lambda$8$lambda$7(state, title, callbacks, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AccountList.AccountList(immutableList, function1, function12, paddingValuesM5135PaddingValues0680j_4, modifierFillMaxWidth$default, (Function1) objRememberedValue3, ComposableLambda3.rememberComposableLambda(925370202, true, new C201934(state, accountNumber, callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 7168) | 1572912, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    paddingValues3 = paddingValuesM5135PaddingValues0680j_4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    paddingValues3 = paddingValues2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountSwitcher5.AccountSwitcher$lambda$9(state, callbacks, modifier3, paddingValues3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            paddingValues2 = paddingValues;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                title = state.getTitle();
                composerStartRestartGroup.startReplaceGroup(80655378);
                if (title == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                AccountSwitcherData.ActiveSelection activeSelection2 = state.getActiveSelection();
                if (!(activeSelection2 instanceof AccountSwitcherData.ActiveSelection.AccountRow)) {
                }
                if (accountRow == null) {
                }
                ImmutableList immutableList2 = extensions2.toImmutableList(state.getRows());
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                Function1 function13 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(state);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(AccountSwitcher5.AccountSwitcher$lambda$6$lambda$5(state, ((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    Function1 function122 = (Function1) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged = composerStartRestartGroup.changed(title) | composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(callbacks);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AccountSwitcher5.AccountSwitcher$lambda$8$lambda$7(state, title, callbacks, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        AccountList.AccountList(immutableList2, function13, function122, paddingValuesM5135PaddingValues0680j_4, modifierFillMaxWidth$default2, (Function1) objRememberedValue3, ComposableLambda3.rememberComposableLambda(925370202, true, new C201934(state, accountNumber, callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 7168) | 1572912, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        paddingValues3 = paddingValuesM5135PaddingValues0680j_4;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        paddingValues2 = paddingValues;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AccountSwitcher$lambda$4$lambda$3(AccountSwitcherRowData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSwitcher$lambda$6$lambda$5(AccountSwitcherData accountSwitcherData, int i) {
        return accountSwitcherData.getShowAllAccountsRow() || i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSwitcher$lambda$8$lambda$7(final AccountSwitcherData accountSwitcherData, final String str, final AccountSwitcherCallbacks accountSwitcherCallbacks, LazyListScope AccountList) {
        Intrinsics.checkNotNullParameter(AccountList, "$this$AccountList");
        LazyListScope.item$default(AccountList, null, "account-selector-title", ComposableLambda3.composableLambdaInstance(-855499515, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt$AccountSwitcher$3$1$1
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
                    ComposerKt.traceEventStart(-855499515, i, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcher.<anonymous>.<anonymous>.<anonymous> (AccountSwitcher.kt:136)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 1, null);
        if (accountSwitcherData.getShowAllAccountsRow()) {
            LazyListScope.item$default(AccountList, null, "account-selector-all-accounts-row", ComposableLambda3.composableLambdaInstance(1793673504, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt$AccountSwitcher$3$1$2
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
                        ComposerKt.traceEventStart(1793673504, i, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcher.<anonymous>.<anonymous>.<anonymous> (AccountSwitcher.kt:147)");
                    }
                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                    String strStringResource = StringResources_androidKt.stringResource(C20198R.string.account_switcher_all_accounts, composer, 0);
                    boolean z = accountSwitcherData.getActiveSelection() instanceof AccountSwitcherData.ActiveSelection.AllAccounts;
                    BentoSelectionRowState.IconPosition.Leading leading = new BentoSelectionRowState.IconPosition.Leading(null, 1, null);
                    AccountSwitcherCallbacks accountSwitcherCallbacks2 = accountSwitcherCallbacks;
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(accountSwitcherCallbacks2);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new AccountSwitcher8(accountSwitcherCallbacks2);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoSelectionRow2.BentoSelectionRow(null, type2, strStringResource, z, null, false, leading, false, false, false, (Function0) ((KFunction) objRememberedValue), composer, (BentoSelectionRowState.IconPosition.Leading.$stable << 18) | 48, 0, 945);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 1, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AccountSwitcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt$AccountSwitcher$4 */
    static final class C201934 implements Function4<LazyItemScope, AccountSwitcherRowData, Composer, Integer, Unit> {
        final /* synthetic */ String $activeAccountNumber;
        final /* synthetic */ AccountSwitcherCallbacks $callbacks;
        final /* synthetic */ AccountSwitcherData $state;

        C201934(AccountSwitcherData accountSwitcherData, String str, AccountSwitcherCallbacks accountSwitcherCallbacks) {
            this.$state = accountSwitcherData;
            this.$activeAccountNumber = str;
            this.$callbacks = accountSwitcherCallbacks;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, AccountSwitcherRowData accountSwitcherRowData, Composer composer, Integer num) {
            invoke(lazyItemScope, accountSwitcherRowData, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope AccountList, final AccountSwitcherRowData row, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AccountList, "$this$AccountList");
            Intrinsics.checkNotNullParameter(row, "row");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(925370202, i, -1, "com.robinhood.android.lib.accountswitcher.AccountSwitcher.<anonymous> (AccountSwitcher.kt:158)");
            }
            BrokerageAccountContext activeAccountContext = AccountSwitcherBottomSheet.getActiveAccountContext(this.$state);
            String str = this.$activeAccountNumber;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(row) | composer.changedInstance(this.$callbacks);
            final AccountSwitcherCallbacks accountSwitcherCallbacks = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt$AccountSwitcher$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountSwitcher5.C201934.invoke$lambda$1$lambda$0(row, accountSwitcherCallbacks);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AccountSwitcher5.AccountSwitcherRow(row, activeAccountContext, str, null, (Function0) objRememberedValue, composer, (i >> 3) & 14, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(AccountSwitcherRowData accountSwitcherRowData, AccountSwitcherCallbacks accountSwitcherCallbacks) {
            if (accountSwitcherRowData instanceof AccountSwitcherRowData.Account) {
                AccountSwitcherRowData.Account account = (AccountSwitcherRowData.Account) accountSwitcherRowData;
                accountSwitcherCallbacks.onAccountSelected(account.getId(), account.getBrokerageAccountType());
            } else {
                if (!(accountSwitcherRowData instanceof AccountSwitcherRowData.PendingApplication)) {
                    throw new NoWhenBranchMatchedException();
                }
                AccountSwitcherRowData.PendingApplication pendingApplication = (AccountSwitcherRowData.PendingApplication) accountSwitcherRowData;
                accountSwitcherCallbacks.onPendingApplicationClicked(pendingApplication.getId(), pendingApplication.getBrokerageAccountType());
            }
            return Unit.INSTANCE;
        }
    }
}
