package com.robinhood.android.retirement.onboarding.agreements;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.android.retirement.lib.RetirementSelectionRow;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RetirementSlipAgreement.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aÏ\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000326\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0016\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0017¨\u0006\u001d"}, m3636d2 = {"RetirementSlipAgreement", "", "loggingIdentifier", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "summaryTitle", "summaryItems", "Lkotlinx/collections/immutable/ImmutableList;", "checkboxTitle", "checkboxStates", "Lcom/robinhood/android/retirement/onboarding/agreements/SlipCheckboxState;", "checkboxSubtitle", "valueProp", "subtitleMarkdown", "agreementLinksMarkdown", "onCheckboxChecked", "Lkotlin/Function2;", "Lcom/robinhood/models/api/BrokerageAccountType;", "Lkotlin/ParameterName;", "name", "accountType", "", "enabled", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "makeCheckboxLoggingIdentifier", "type", "checked", "feature-retirement-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.onboarding.agreements.RetirementSlipAgreementKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementSlipAgreement {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementSlipAgreement$lambda$6(String str, Modifier modifier, String str2, String str3, ImmutableList immutableList, String str4, ImmutableList immutableList2, String str5, String str6, String str7, String str8, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        RetirementSlipAgreement(str, modifier, str2, str3, immutableList, str4, immutableList2, str5, str6, str7, str8, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RetirementSlipAgreement(final String str, Modifier modifier, String str2, String str3, ImmutableList<String> immutableList, String str4, ImmutableList<SlipCheckboxState> immutableList2, String str5, String str6, String str7, String str8, final Function2<? super BrokerageAccountType, ? super Boolean, Unit> onCheckboxChecked, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        String str9;
        int i6;
        int i7;
        ImmutableList<String> immutableList3;
        int i8;
        String str10;
        int i9;
        ImmutableList<SlipCheckboxState> immutableListPersistentListOf;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String str11;
        String str12;
        Modifier modifier3;
        Modifier modifier4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        String str13;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ImmutableList<String> immutableList4;
        ImmutableList<SlipCheckboxState> immutableList5;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        final String str20;
        final String str21;
        final String str22;
        final String str23;
        final String str24;
        final ImmutableList<String> immutableList6;
        final ImmutableList<SlipCheckboxState> immutableList7;
        final String str25;
        final String str26;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCheckboxChecked, "onCheckboxChecked");
        Composer composerStartRestartGroup = composer.startRestartGroup(416566756);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str9 = str2;
                    i4 |= composerStartRestartGroup.changed(str9) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            immutableList3 = immutableList;
                            i4 |= composerStartRestartGroup.changed(immutableList3) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                            str10 = str4;
                        } else {
                            str10 = str4;
                            if ((i & 196608) == 0) {
                                i4 |= composerStartRestartGroup.changed(str10) ? 131072 : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            immutableListPersistentListOf = immutableList2;
                        } else {
                            immutableListPersistentListOf = immutableList2;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(immutableListPersistentListOf) ? 1048576 : 524288;
                            }
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                i11 = i10;
                                i4 |= composerStartRestartGroup.changed(str5) ? 8388608 : 4194304;
                            }
                            i12 = i3 & 256;
                            if (i12 == 0) {
                                i4 |= 100663296;
                            } else {
                                if ((i & 100663296) == 0) {
                                    i13 = i12;
                                    i4 |= composerStartRestartGroup.changed(str6) ? 67108864 : 33554432;
                                }
                                i14 = i3 & 512;
                                if (i14 == 0) {
                                    if ((i & 805306368) == 0) {
                                        i15 = i14;
                                        i4 |= composerStartRestartGroup.changed(str7) ? 536870912 : 268435456;
                                    }
                                    i16 = i3 & 1024;
                                    if (i16 == 0) {
                                        i18 = i2 | 6;
                                        i17 = i16;
                                    } else if ((i2 & 6) == 0) {
                                        i17 = i16;
                                        i18 = i2 | (composerStartRestartGroup.changed(str8) ? 4 : 2);
                                    } else {
                                        i17 = i16;
                                        i18 = i2;
                                    }
                                    if ((i3 & 2048) == 0) {
                                        i18 |= 48;
                                    } else if ((i2 & 48) == 0) {
                                        i18 |= composerStartRestartGroup.changedInstance(onCheckboxChecked) ? 32 : 16;
                                    }
                                    int i20 = i18;
                                    if ((i4 & 306783379) == 306783378 || (i20 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                                        Modifier modifier5 = i19 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (i5 != 0) {
                                            str9 = null;
                                        }
                                        String str27 = i6 == 0 ? null : str3;
                                        if (i7 != 0) {
                                            immutableList3 = null;
                                        }
                                        if (i8 != 0) {
                                            str10 = null;
                                        }
                                        if (i9 != 0) {
                                            immutableListPersistentListOf = extensions2.persistentListOf();
                                        }
                                        String str28 = i11 == 0 ? null : str5;
                                        str11 = i13 == 0 ? null : str6;
                                        str12 = i15 == 0 ? null : str7;
                                        String str29 = i17 == 0 ? null : str8;
                                        if (ComposerKt.isTraceInProgress()) {
                                            modifier3 = modifier5;
                                        } else {
                                            modifier3 = modifier5;
                                            ComposerKt.traceEventStart(416566756, i4, i20, "com.robinhood.android.retirement.onboarding.agreements.RetirementSlipAgreement (RetirementSlipAgreement.kt:36)");
                                        }
                                        final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier3, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(null, str != null ? "" : str, null, 5, null), null, 47, null), !(str != null || str.length() == 0), false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                        modifier4 = modifier3;
                                        int i21 = i4;
                                        String str30 = str10;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
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
                                        str13 = str27;
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(955703182);
                                        if (str9 != null) {
                                            immutableList4 = immutableList3;
                                            immutableList5 = immutableListPersistentListOf;
                                            str14 = str28;
                                        } else if (immutableListPersistentListOf.size() == 1) {
                                            composerStartRestartGroup.startReplaceGroup(-437918612);
                                            final SlipCheckboxState slipCheckboxState = immutableListPersistentListOf.get(0);
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i22 = BentoTheme.$stable;
                                            immutableList4 = immutableList3;
                                            immutableList5 = immutableListPersistentListOf;
                                            String str31 = str28;
                                            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i22).m21593getSmallD9Ej5fM(), 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(null, makeCheckboxLoggingIdentifier(slipCheckboxState.getAccountType(), slipCheckboxState.isChecked()), null, 5, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                            boolean zIsChecked = slipCheckboxState.isChecked();
                                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changed(slipCheckboxState) | ((i20 & 112) == 32);
                                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSlipAgreementKt$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return RetirementSlipAgreement.RetirementSlipAgreement$lambda$5$lambda$1$lambda$0(current, slipCheckboxState, onCheckboxChecked, ((Boolean) obj).booleanValue());
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            RetirementSelectionRow.RetirementSelectionRow(str9, zIsChecked, (Function1) objRememberedValue, modifierAutoLogEvents$default2, false, null, null, null, true, true, composerStartRestartGroup, ((i21 >> 6) & 14) | 905969664, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                                            if (str31 != null) {
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i22).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                                                BentoText2.m20747BentoText38GnDrw(str31, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i22).getTextS(), composerStartRestartGroup, ((i21 >> 21) & 14) | 24576, 0, 8174);
                                                str14 = str31;
                                            } else {
                                                str14 = str31;
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            immutableList4 = immutableList3;
                                            immutableList5 = immutableListPersistentListOf;
                                            str14 = str28;
                                            composerStartRestartGroup.startReplaceGroup(-436084373);
                                            BentoText2.m20747BentoText38GnDrw(str9, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), composerStartRestartGroup, ((i21 >> 6) & 14) | 24576, 0, 8174);
                                            composerStartRestartGroup.endReplaceGroup();
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(955771180);
                                        if (str11 == null) {
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                            int i23 = BentoTheme.$stable;
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i23).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                            String str32 = str11;
                                            BentoText2.m20747BentoText38GnDrw(str32, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i23).getTextS(), composerStartRestartGroup, (i21 >> 24) & 14, 0, 8190);
                                            str15 = str32;
                                        } else {
                                            str15 = str11;
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(955780809);
                                        if (immutableList5.size() <= 1) {
                                            composerStartRestartGroup.startReplaceGroup(955780062);
                                            if (str30 != null) {
                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                                int i24 = BentoTheme.$stable;
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme3.getSpacing(composerStartRestartGroup, i24).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                                BentoText2.m20747BentoText38GnDrw(str30, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i24).getTextS(), composerStartRestartGroup, ((i21 >> 15) & 14) | 24576, 0, 8174);
                                                str16 = str30;
                                            } else {
                                                str16 = str30;
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(955792101);
                                            Iterator<SlipCheckboxState> it = immutableList5.iterator();
                                            int i25 = 0;
                                            while (it.hasNext()) {
                                                SlipCheckboxState next = it.next();
                                                int i26 = i25 + 1;
                                                if (i25 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                final SlipCheckboxState slipCheckboxState2 = next;
                                                composerStartRestartGroup.startReplaceGroup(955792152);
                                                if (i25 == 0) {
                                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                String str33 = str15;
                                                Iterator<SlipCheckboxState> it2 = it;
                                                Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(null, makeCheckboxLoggingIdentifier(slipCheckboxState2.getAccountType(), slipCheckboxState2.isChecked()), null, 5, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                                String label = slipCheckboxState2.getLabel();
                                                FontWeight normal = FontWeight.INSTANCE.getNormal();
                                                boolean zIsChecked2 = slipCheckboxState2.isChecked();
                                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changed(slipCheckboxState2) | ((i20 & 112) == 32);
                                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSlipAgreementKt$$ExternalSyntheticLambda1
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return RetirementSlipAgreement.RetirementSlipAgreement$lambda$5$lambda$4$lambda$3$lambda$2(current, slipCheckboxState2, onCheckboxChecked, ((Boolean) obj).booleanValue());
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                RetirementSelectionRow.RetirementSelectionRow(label, zIsChecked2, (Function1) objRememberedValue2, modifierAutoLogEvents$default3, false, null, normal, null, true, true, composerStartRestartGroup, 907542528, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
                                                it = it2;
                                                str15 = str33;
                                                i25 = i26;
                                            }
                                            str17 = str15;
                                            composerStartRestartGroup.endReplaceGroup();
                                            if (str14 != null) {
                                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                                BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                                int i27 = BentoTheme.$stable;
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme4.getSpacing(composerStartRestartGroup, i27).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                                str18 = str14;
                                                BentoText2.m20747BentoText38GnDrw(str18, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composerStartRestartGroup, i27).getTextS(), composerStartRestartGroup, ((i21 >> 21) & 14) | 24576, 0, 8174);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(955856578);
                                            str19 = str29;
                                            if (str19 != null) {
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                                InstantRetirementAgreementComponents.RetirementMarkdownText(str19, null, composerStartRestartGroup, i20 & 14, 2);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(955863735);
                                            if (str13 != null && immutableList4 != null && !immutableList4.isEmpty()) {
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                                                InstantRetirementAgreementComponents.SummarySection(str13, immutableList4, null, composerStartRestartGroup, (i21 >> 9) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(955872470);
                                            if (str12 != null) {
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                                InstantRetirementAgreementComponents.RetirementMarkdownText(str12, null, composerStartRestartGroup, (i21 >> 27) & 14, 2);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            str20 = str17;
                                            str21 = str16;
                                            str22 = str9;
                                            str23 = str12;
                                            str24 = str18;
                                            immutableList6 = immutableList4;
                                            immutableList7 = immutableList5;
                                            str25 = str19;
                                            str26 = str13;
                                        } else {
                                            str16 = str30;
                                            str17 = str15;
                                        }
                                        str18 = str14;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(955856578);
                                        str19 = str29;
                                        if (str19 != null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(955863735);
                                        if (str13 != null) {
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                                            InstantRetirementAgreementComponents.SummarySection(str13, immutableList4, null, composerStartRestartGroup, (i21 >> 9) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(955872470);
                                        if (str12 != null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        str20 = str17;
                                        str21 = str16;
                                        str22 = str9;
                                        str23 = str12;
                                        str24 = str18;
                                        immutableList6 = immutableList4;
                                        immutableList7 = immutableList5;
                                        str25 = str19;
                                        str26 = str13;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        str26 = str3;
                                        str23 = str7;
                                        str21 = str10;
                                        immutableList6 = immutableList3;
                                        immutableList7 = immutableListPersistentListOf;
                                        modifier4 = modifier2;
                                        str22 = str9;
                                        str24 = str5;
                                        str20 = str6;
                                        str25 = str8;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        final Modifier modifier6 = modifier4;
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSlipAgreementKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return RetirementSlipAgreement.RetirementSlipAgreement$lambda$6(str, modifier6, str22, str26, immutableList6, str21, immutableList7, str24, str20, str23, str25, onCheckboxChecked, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i4 |= 805306368;
                                i15 = i14;
                                i16 = i3 & 1024;
                                if (i16 == 0) {
                                }
                                if ((i3 & 2048) == 0) {
                                }
                                int i202 = i18;
                                if ((i4 & 306783379) == 306783378) {
                                    if (i19 == 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                                    if (str != null) {
                                        Modifier modifierAutoLogEvents$default4 = ModifiersKt.autoLogEvents$default(modifier3, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(null, str != null ? "" : str, null, 5, null), null, 47, null), !(str != null || str.length() == 0), false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                        modifier4 = modifier3;
                                        int i212 = i4;
                                        String str302 = str10;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default4);
                                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        str13 = str27;
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl.getInserting()) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion6.getSetModifier());
                                            Column6 column62 = Column6.INSTANCE;
                                            composerStartRestartGroup.startReplaceGroup(955703182);
                                            if (str9 != null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(955771180);
                                            if (str11 == null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(955780809);
                                            if (immutableList5.size() <= 1) {
                                            }
                                            str18 = str14;
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(955856578);
                                            str19 = str29;
                                            if (str19 != null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(955863735);
                                            if (str13 != null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(955872470);
                                            if (str12 != null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            str20 = str17;
                                            str21 = str16;
                                            str22 = str9;
                                            str23 = str12;
                                            str24 = str18;
                                            immutableList6 = immutableList4;
                                            immutableList7 = immutableList5;
                                            str25 = str19;
                                            str26 = str13;
                                        }
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i13 = i12;
                            i14 = i3 & 512;
                            if (i14 == 0) {
                            }
                            i15 = i14;
                            i16 = i3 & 1024;
                            if (i16 == 0) {
                            }
                            if ((i3 & 2048) == 0) {
                            }
                            int i2022 = i18;
                            if ((i4 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i11 = i10;
                        i12 = i3 & 256;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        i14 = i3 & 512;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        i16 = i3 & 1024;
                        if (i16 == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        int i20222 = i18;
                        if ((i4 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    immutableList3 = immutableList;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    i12 = i3 & 256;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i3 & 512;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    i16 = i3 & 1024;
                    if (i16 == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    int i202222 = i18;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                immutableList3 = immutableList;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i3 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i3 & 1024;
                if (i16 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i2022222 = i18;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str9 = str2;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            immutableList3 = immutableList;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i3 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i3 & 1024;
            if (i16 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            int i20222222 = i18;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        str9 = str2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        immutableList3 = immutableList;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i3 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i3 & 1024;
        if (i16 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i202222222 = i18;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementSlipAgreement$lambda$5$lambda$1$lambda$0(EventLogger eventLogger, SlipCheckboxState slipCheckboxState, Function2 function2, boolean z) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(null, makeCheckboxLoggingIdentifier(slipCheckboxState.getAccountType(), z), null, 5, null), null, null, false, 59, null);
        function2.invoke(slipCheckboxState.getAccountType(), Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementSlipAgreement$lambda$5$lambda$4$lambda$3$lambda$2(EventLogger eventLogger, SlipCheckboxState slipCheckboxState, Function2 function2, boolean z) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(null, makeCheckboxLoggingIdentifier(slipCheckboxState.getAccountType(), z), null, 5, null), null, null, false, 59, null);
        function2.invoke(slipCheckboxState.getAccountType(), Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final String makeCheckboxLoggingIdentifier(BrokerageAccountType type2, boolean z) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return type2.name() + "_" + (z ? "CHECKED" : "UNCHECKED");
    }
}
