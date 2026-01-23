package com.robinhood.android.common.recurring.assetSelection;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoPogBackgroundOverride;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.DefaultScreenMargins;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.compose.util.UriHandleContent;
import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.librobinhood.data.store.SweepsStatus;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.recurring.models.RecurringInvestmentCategory;
import com.robinhood.recurring.models.RecurringInvestmentCategory2;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringAssetCategorySelectionV2Composable.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a\u0091\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001aW\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0019\u001aW\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0019\u001a\u0017\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u001c\u001a5\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u001e\u001am\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010#\u001a\u0017\u0010$\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010%\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010&\u001a\r\u0010'\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010&\"\u001a\u0010(\u001a\u00020)*\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006,²\u0006\n\u0010-\u001a\u00020.X\u008a\u008e\u0002"}, m3636d2 = {"RecurringAssetCategorySelectionV2Composable", "", "sweepsStatus", "Lcom/robinhood/librobinhood/data/store/SweepsStatus;", "retirementMatchRate", "Ljava/math/BigDecimal;", "rothIraRemainingToLimit", "Lcom/robinhood/models/util/Money;", "traditionalIraRemainingToLimit", "individualBrokerageAccountNumber", "", "rothIraAccountNumber", "traditionalIraAccountNumber", "isGold", "", "brokerageCashOptionEnabled", "retirementCashOptionEnabled", "investmentOptionEnabled", "onSelectAssetCategory", "Lkotlin/Function1;", "Lcom/robinhood/recurring/models/RecurringInvestmentSelection;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/librobinhood/data/store/SweepsStatus;Ljava/math/BigDecimal;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "BrokerageSection", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/librobinhood/data/store/SweepsStatus;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "BrokerageSectionOptions", "RetirementSectionTitle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RetirementSetUpCard", "(Landroidx/compose/ui/Modifier;Ljava/math/BigDecimal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RetirementSectionOptions", "hasRothIraAccount", "hasTraditionalIraAccount", "Lcom/robinhood/recurring/models/RecurringInvestmentCategory;", "(Landroidx/compose/ui/Modifier;ZZLjava/math/BigDecimal;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Disclosure", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "PreviewNight", "brokerageCashSweepsState", "Lcom/robinhood/android/common/recurring/assetSelection/BrokerageCashSweepsState;", "getBrokerageCashSweepsState", "(Lcom/robinhood/librobinhood/data/store/SweepsStatus;)Lcom/robinhood/android/common/recurring/assetSelection/BrokerageCashSweepsState;", "feature-lib-recurring_externalDebug", "positionInWindow", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RecurringAssetCategorySelectionV2Composable7 {

    /* compiled from: RecurringAssetCategorySelectionV2Composable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringAssetCategorySelectionV2Composable.values().length];
            try {
                iArr[RecurringAssetCategorySelectionV2Composable.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringAssetCategorySelectionV2Composable.ELIGIBLE_NOT_ENROLLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringAssetCategorySelectionV2Composable.INELIGIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrokerageSection$lambda$5(Modifier modifier, SweepsStatus sweepsStatus, boolean z, boolean z2, boolean z3, String str, Function1 function1, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        BrokerageSection(modifier, sweepsStatus, z, z2, z3, str, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrokerageSectionOptions$lambda$18(Modifier modifier, SweepsStatus sweepsStatus, boolean z, boolean z2, boolean z3, String str, Function1 function1, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        BrokerageSectionOptions(modifier, sweepsStatus, z, z2, z3, str, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Disclosure$lambda$33(Modifier modifier, int i, int i2, Composer composer, int i3) {
        Disclosure(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$34(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewNight$lambda$35(int i, Composer composer, int i2) {
        PreviewNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringAssetCategorySelectionV2Composable$lambda$3(SweepsStatus sweepsStatus, BigDecimal bigDecimal, Money money, Money money2, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, Function1 function1, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        RecurringAssetCategorySelectionV2Composable(sweepsStatus, bigDecimal, money, money2, str, str2, str3, z, z2, z3, z4, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementSectionOptions$lambda$30(Modifier modifier, boolean z, boolean z2, BigDecimal bigDecimal, Money money, Money money2, String str, String str2, Function1 function1, int i, int i2, Composer composer, int i3) {
        RetirementSectionOptions(modifier, z, z2, bigDecimal, money, money2, str, str2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementSectionTitle$lambda$19(Modifier modifier, int i, int i2, Composer composer, int i3) {
        RetirementSectionTitle(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementSetUpCard$lambda$21(Modifier modifier, BigDecimal bigDecimal, Function1 function1, int i, int i2, Composer composer, int i3) {
        RetirementSetUpCard(modifier, bigDecimal, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringAssetCategorySelectionV2Composable(final SweepsStatus sweepsStatus, final BigDecimal bigDecimal, final Money money, final Money money2, final String str, final String str2, final String str3, final boolean z, final boolean z2, final boolean z3, final boolean z4, final Function1<? super RecurringInvestmentCategory2, Unit> onSelectAssetCategory, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        String str4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z5;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i9;
        Modifier.Companion companion;
        int i10;
        Composer composer2;
        int i11;
        int i12;
        BentoTheme bentoTheme;
        int i13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onSelectAssetCategory, "onSelectAssetCategory");
        Composer composerStartRestartGroup = composer.startRestartGroup(748617995);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(sweepsStatus) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(bigDecimal) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(money) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(money2) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            str4 = str;
                            i4 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i4 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
                        }
                        if ((i3 & 64) != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(str3) ? 1048576 : 524288;
                        }
                        if ((i3 & 128) != 0) {
                            i4 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                i4 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                            }
                            if ((i3 & 256) == 0) {
                                i4 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i4 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
                            }
                            if ((i3 & 512) == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i4 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                            }
                            i5 = i4;
                            if ((i3 & 1024) == 0) {
                                i6 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i6 = i2 | (composerStartRestartGroup.changed(z4) ? 4 : 2);
                            } else {
                                i6 = i2;
                            }
                            if ((i3 & 2048) == 0) {
                                i6 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i6 |= composerStartRestartGroup.changedInstance(onSelectAssetCategory) ? 32 : 16;
                            }
                            i7 = i3 & 4096;
                            if (i7 != 0) {
                                i8 = i7;
                                if ((i2 & 384) == 0) {
                                    i6 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                                }
                                if ((i5 & 306783379) == 306783378 && (i6 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                } else {
                                    Modifier modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(748617995, i5, i6, "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2Composable (RecurringAssetCategorySelectionV2Composable.kt:74)");
                                    }
                                    boolean z6 = str2 == null;
                                    z5 = str3 == null;
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                                    modifier2 = modifier3;
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.Vertical top = arrangement.getTop();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    boolean z7 = z6;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    DefaultScreenMargins defaultScreenMargins = DefaultScreenMargins.INSTANCE;
                                    i9 = i6;
                                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion4, defaultScreenMargins.m21613getTopD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2);
                                    String strStringResource = StringResources_androidKt.stringResource(C11595R.string.recurring_asset_category_selection_title_paycheck, composerStartRestartGroup, 0);
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i14 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i14).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11595R.string.recurring_asset_category_selection_subtitle_paycheck, composerStartRestartGroup, 0), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion4, defaultScreenMargins.m21613getTopD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i14).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    if (!z5 || z7) {
                                        composerStartRestartGroup.startReplaceGroup(-1566454408);
                                        composerStartRestartGroup.startReplaceGroup(1473489679);
                                        if (z3) {
                                            companion = companion4;
                                            i10 = 458752;
                                            composer2 = composerStartRestartGroup;
                                            i11 = 57344;
                                            i12 = 1;
                                            bentoTheme = bentoTheme2;
                                            i13 = i14;
                                        } else {
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
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
                                            companion = companion4;
                                            RetirementSectionTitle(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i14).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), composerStartRestartGroup, 0, 0);
                                            int i15 = (i5 << 6) & 523264;
                                            int i16 = i5 << 3;
                                            i10 = 458752;
                                            composer2 = composerStartRestartGroup;
                                            i11 = 57344;
                                            i12 = 1;
                                            bentoTheme = bentoTheme2;
                                            i13 = i14;
                                            RetirementSectionOptions(null, z7, z5, bigDecimal, money, money2, str2, str3, onSelectAssetCategory, composer2, i15 | (i16 & 3670016) | (i16 & 29360128) | ((i9 << 21) & 234881024), 1);
                                            composer2.endNode();
                                        }
                                        composer2.endReplaceGroup();
                                        if (!z2 || z4) {
                                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i13).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                            int i17 = i5 << 3;
                                            int i18 = i5 >> 15;
                                            composerStartRestartGroup = composer2;
                                            BrokerageSection(modifierM5146paddingqDBjuR0$default, sweepsStatus, z, z2, z4, str, onSelectAssetCategory, composerStartRestartGroup, (i17 & i10) | (i17 & 112) | (i18 & 896) | (i18 & 7168) | ((i9 << 12) & i11) | ((i9 << 15) & 3670016), 0);
                                        } else {
                                            composerStartRestartGroup = composer2;
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-1567498395);
                                        composerStartRestartGroup.startReplaceGroup(1473456203);
                                        if (z2 || z4) {
                                            int i19 = i5 << 3;
                                            int i20 = i5 >> 15;
                                            BrokerageSection(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i14).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), sweepsStatus, z, z2, z4, str4, onSelectAssetCategory, composerStartRestartGroup, (i19 & 458752) | (i19 & 112) | (i20 & 896) | (i20 & 7168) | ((i9 << 12) & 57344) | ((i9 << 15) & 3670016), 0);
                                            composerStartRestartGroup = composerStartRestartGroup;
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        if (z3) {
                                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                            if (composerStartRestartGroup.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (composerStartRestartGroup.getInserting()) {
                                                composerStartRestartGroup.createNode(constructor3);
                                            } else {
                                                composerStartRestartGroup.useNode();
                                            }
                                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                            RetirementSectionTitle(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i14).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), composerStartRestartGroup, 0, 0);
                                            Composer composer3 = composerStartRestartGroup;
                                            RetirementSetUpCard(null, bigDecimal, onSelectAssetCategory, composer3, (i5 & 112) | ((i9 << 3) & 896), 1);
                                            composerStartRestartGroup = composer3;
                                            composerStartRestartGroup.endNode();
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        companion = companion4;
                                        i12 = 1;
                                    }
                                    Disclosure(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, i12), composerStartRestartGroup, 0, 0);
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    final Modifier modifier4 = modifier2;
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return RecurringAssetCategorySelectionV2Composable7.RecurringAssetCategorySelectionV2Composable$lambda$3(sweepsStatus, bigDecimal, money, money2, str, str2, str3, z, z2, z3, z4, onSelectAssetCategory, modifier4, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i6 |= 384;
                            i8 = i7;
                            if ((i5 & 306783379) == 306783378) {
                                if (i8 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (str2 == null) {
                                }
                                if (str3 == null) {
                                }
                                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                                modifier2 = modifier3;
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                Arrangement.Vertical top2 = arrangement2.getTop();
                                Alignment.Companion companion22 = Alignment.INSTANCE;
                                boolean z72 = z6;
                                MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    Modifier.Companion companion42 = Modifier.INSTANCE;
                                    DefaultScreenMargins defaultScreenMargins2 = DefaultScreenMargins.INSTANCE;
                                    i9 = i6;
                                    Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion42, defaultScreenMargins2.m21613getTopD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2);
                                    String strStringResource2 = StringResources_androidKt.stringResource(C11595R.string.recurring_asset_category_selection_title_paycheck, composerStartRestartGroup, 0);
                                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                    int i142 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM21622defaultHorizontalPaddingWMci_g02, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composerStartRestartGroup, i142).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11595R.string.recurring_asset_category_selection_subtitle_paycheck, composerStartRestartGroup, 0), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion42, defaultScreenMargins2.m21613getTopD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composerStartRestartGroup, i142).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    if (z5) {
                                        composerStartRestartGroup.startReplaceGroup(-1566454408);
                                        composerStartRestartGroup.startReplaceGroup(1473489679);
                                        if (z3) {
                                        }
                                        composer2.endReplaceGroup();
                                        if (z2) {
                                            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i13).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                            int i172 = i5 << 3;
                                            int i182 = i5 >> 15;
                                            composerStartRestartGroup = composer2;
                                            BrokerageSection(modifierM5146paddingqDBjuR0$default2, sweepsStatus, z, z2, z4, str, onSelectAssetCategory, composerStartRestartGroup, (i172 & i10) | (i172 & 112) | (i182 & 896) | (i182 & 7168) | ((i9 << 12) & i11) | ((i9 << 15) & 3670016), 0);
                                            composerStartRestartGroup.endReplaceGroup();
                                            Disclosure(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, i12), composerStartRestartGroup, 0, 0);
                                            composerStartRestartGroup.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        i5 = i4;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        i7 = i3 & 4096;
                        if (i7 != 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    str4 = str;
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    i5 = i4;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    i7 = i3 & 4096;
                    if (i7 != 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 16) == 0) {
                }
                str4 = str;
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                i5 = i4;
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                i7 = i3 & 4096;
                if (i7 != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) == 0) {
            }
            str4 = str;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            i5 = i4;
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            i7 = i3 & 4096;
            if (i7 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) == 0) {
        }
        str4 = str;
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i5 = i4;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        i7 = i3 & 4096;
        if (i7 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final long BrokerageSectionOptions$lambda$7(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BrokerageSection(Modifier modifier, final SweepsStatus sweepsStatus, final boolean z, final boolean z2, final boolean z3, final String str, final Function1<? super RecurringInvestmentCategory2, Unit> function1, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        Modifier modifier2;
        int i3;
        SweepsStatus sweepsStatus2;
        boolean z4;
        boolean z5;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-885643541);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                sweepsStatus2 = sweepsStatus;
                i3 |= composerStartRestartGroup.changedInstance(sweepsStatus2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z4 = z;
                    i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z5 = z2;
                        i3 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                    }
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= 196608;
                        } else {
                            if ((i & 196608) == 0) {
                                i3 |= composerStartRestartGroup.changed(str) ? 131072 : 65536;
                            }
                            if ((i2 & 64) != 0) {
                                if ((i & 1572864) == 0) {
                                    i3 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                                }
                                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    composer2 = composerStartRestartGroup;
                                    modifier3 = modifier2;
                                } else {
                                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-885643541, i3, -1, "com.robinhood.android.common.recurring.assetSelection.BrokerageSection (RecurringAssetCategorySelectionV2Composable.kt:154)");
                                    }
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                                    Modifier modifier5 = modifier4;
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1);
                                    String strStringResource = StringResources_androidKt.stringResource(C11595R.string.recurring_asset_category_selection_brokerage_section_title, composerStartRestartGroup, 0);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i5 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 24576, 0, 8172);
                                    BrokerageSectionOptions(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), sweepsStatus2, z4, z5, z3, str, function1, composerStartRestartGroup, i3 & 4194288, 0);
                                    composer2 = composerStartRestartGroup;
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier5;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return RecurringAssetCategorySelectionV2Composable7.BrokerageSection$lambda$5(modifier3, sweepsStatus, z, z2, z3, str, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 1572864;
                            if ((599187 & i3) == 599186) {
                                if (i4 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Modifier modifier52 = modifier4;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    Modifier.Companion companion22 = Modifier.INSTANCE;
                                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion22, 0.0f, composerStartRestartGroup, 6, 1);
                                    String strStringResource2 = StringResources_androidKt.stringResource(C11595R.string.recurring_asset_category_selection_brokerage_section_title, composerStartRestartGroup, 0);
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i52 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM21623defaultHorizontalPaddingrAjV9yQ2, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 24576, 0, 8172);
                                    BrokerageSectionOptions(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), sweepsStatus2, z4, z5, z3, str, function1, composerStartRestartGroup, i3 & 4194288, 0);
                                    composer2 = composerStartRestartGroup;
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        if ((i2 & 64) != 0) {
                        }
                        if ((599187 & i3) == 599186) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((599187 & i3) == 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z2;
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z;
            if ((i2 & 8) != 0) {
            }
            z5 = z2;
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        sweepsStatus2 = sweepsStatus;
        if ((i2 & 4) == 0) {
        }
        z4 = z;
        if ((i2 & 8) != 0) {
        }
        z5 = z2;
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03f2  */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BrokerageSectionOptions(Modifier modifier, final SweepsStatus sweepsStatus, final boolean z, final boolean z2, final boolean z3, final String str, final Function1<? super RecurringInvestmentCategory2, Unit> function1, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        int i4;
        Modifier modifier4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final Modifier modifier5;
        String str2;
        BentoBaseRowState.Start textPog;
        int i10;
        int i11;
        String strStringResource;
        boolean z4;
        Object objRememberedValue;
        BentoPogBackgroundOverride colorOverride;
        Composer composerStartRestartGroup = composer.startRestartGroup(-977416337);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sweepsStatus) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        }
        int i13 = 196608;
        if ((i2 & 32) != 0) {
            i3 |= i13;
        } else if ((196608 & i) == 0) {
            i13 = composerStartRestartGroup.changed(str) ? 131072 : 65536;
            i3 |= i13;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier5 = modifier2;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier6 = i12 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-977416337, i3, -1, "com.robinhood.android.common.recurring.assetSelection.BrokerageSectionOptions (RecurringAssetCategorySelectionV2Composable.kt:183)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                modifier3 = modifier6;
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), null, 2, null);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                modifier3 = modifier6;
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifier7 = modifier3;
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier7);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(2056332533);
            if (z2) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                i8 = 3670016;
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                i9 = 458752;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RecurringAssetCategorySelectionV2Composable7.BrokerageSectionOptions$lambda$17$lambda$10$lambda$9(snapshotState, (LayoutCoordinates) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion3, (Function1) objRememberedValue3);
                RecurringAssetCategorySelectionV2Composable brokerageCashSweepsState = sweepsStatus != null ? getBrokerageCashSweepsState(sweepsStatus) : null;
                int i14 = brokerageCashSweepsState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[brokerageCashSweepsState.ordinal()];
                if (i14 == -1) {
                    i4 = i3;
                    modifier4 = modifier7;
                    str2 = null;
                    composerStartRestartGroup.startReplaceGroup(2056394534);
                    BentoBaseRowState.Start.PictogramPog pictogramPog = new BentoBaseRowState.Start.PictogramPog(ServerToBentoAssetMapper3.DOLLAR_SIGN, Color.m6701boximpl(BentoColor.INSTANCE.m21166getDayBg0d7_KjU()), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU()), null);
                    composerStartRestartGroup.endReplaceGroup();
                    textPog = pictogramPog;
                    String strStringResource2 = StringResources_androidKt.stringResource(C11595R.string.recurring_asset_category_selection_brokerage_cash_option_primary, composerStartRestartGroup, 0);
                    ?? brokerageCashSweepsState2 = sweepsStatus == null ? getBrokerageCashSweepsState(sweepsStatus) : str2;
                    i10 = brokerageCashSweepsState2 != 0 ? -1 : WhenMappings.$EnumSwitchMapping$0[brokerageCashSweepsState2.ordinal()];
                    if (i10 == -1) {
                        if (i10 == 1) {
                            i11 = 3;
                            composerStartRestartGroup.startReplaceGroup(2056413603);
                            strStringResource = StringResources_androidKt.stringResource(C11595R.string.f4034x5d2a3cda, new Object[]{NumberFormatter.DefaultImpls.formatNullable$default(Formats.getInterestRateFormatShort(), sweepsStatus.getSweepInterestRate(), str2, 2, str2)}, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (i10 != 2) {
                            i11 = 3;
                            if (i10 != 3) {
                                composerStartRestartGroup.startReplaceGroup(2056410934);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            i11 = 3;
                            composerStartRestartGroup.startReplaceGroup(2056424176);
                            strStringResource = StringResources_androidKt.stringResource(C11595R.string.f4033x1a743686, new Object[]{NumberFormatter.DefaultImpls.formatNullable$default(Formats.getInterestRateFormatShort(), sweepsStatus.getSweepInterestRate(), str2, 2, str2)}, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState(textPog, strStringResource2, strStringResource, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null);
                        i5 = -1633490746;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        z4 = ((i4 & 3670016) == 1048576) | ((i4 & 458752) == 131072);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4 || objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RecurringAssetCategorySelectionV2Composable7.BrokerageSectionOptions$lambda$17$lambda$13$lambda$12(str, function1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer3 = composerStartRestartGroup;
                        i7 = 131072;
                        i6 = 1048576;
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierOnGloballyPositioned, bentoBaseRowState, true, false, false, 0L, (Function0) objRememberedValue, composer3, (BentoBaseRowState.$stable << i11) | 390, 56);
                        composerStartRestartGroup = composer3;
                    } else {
                        i11 = 3;
                    }
                    composerStartRestartGroup.startReplaceGroup(2056436580);
                    strStringResource = StringResources_androidKt.stringResource(C11595R.string.f4032x902cf618, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowState bentoBaseRowState2 = new BentoBaseRowState(textPog, strStringResource2, strStringResource, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null);
                    i5 = -1633490746;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((i4 & 458752) == 131072) {
                    }
                    z4 = ((i4 & 3670016) == 1048576) | ((i4 & 458752) == 131072);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z4) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RecurringAssetCategorySelectionV2Composable7.BrokerageSectionOptions$lambda$17$lambda$13$lambda$12(str, function1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer32 = composerStartRestartGroup;
                        i7 = 131072;
                        i6 = 1048576;
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierOnGloballyPositioned, bentoBaseRowState2, true, false, false, 0L, (Function0) objRememberedValue, composer32, (BentoBaseRowState.$stable << i11) | 390, 56);
                        composerStartRestartGroup = composer32;
                    }
                } else {
                    if (i14 == 1) {
                        composerStartRestartGroup.startReplaceGroup(2056344165);
                        String strStringResource3 = StringResources_androidKt.stringResource(C11595R.string.recurring_asset_category_selection_brokerage_cash_option_pog, new Object[]{NumberFormatter.DefaultImpls.formatNullable$default(Formats.getInterestRateFormatShort(), sweepsStatus.getSweepInterestRate(), null, 2, null)}, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(2056354960);
                        Color colorM6701boximpl = z ? Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet()) : null;
                        composerStartRestartGroup.endReplaceGroup();
                        if (z) {
                            composerStartRestartGroup.startReplaceGroup(-677274604);
                            Brush.Companion companion4 = Brush.INSTANCE;
                            long jBrokerageSectionOptions$lambda$7 = BrokerageSectionOptions$lambda$7(snapshotState);
                            str2 = null;
                            i4 = i3;
                            modifier4 = modifier7;
                            colorOverride = new BentoPogBackgroundOverride.BrushOverride(GoldSparkleBrush.m15094sparkleEPk0efs(companion4, jBrokerageSectionOptions$lambda$7, null, composerStartRestartGroup, 6, 2));
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            i4 = i3;
                            modifier4 = modifier7;
                            str2 = null;
                            composerStartRestartGroup.startReplaceGroup(-677132903);
                            colorOverride = new BentoPogBackgroundOverride.ColorOverride(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU(), null);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        textPog = new BentoBaseRowState.Start.TextPog(strStringResource3, colorM6701boximpl, colorOverride, null, 8, null);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i14 != 2) {
                        if (i14 != 3) {
                            composerStartRestartGroup.startReplaceGroup(2056341081);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        i4 = i3;
                        modifier4 = modifier7;
                        str2 = null;
                        composerStartRestartGroup.startReplaceGroup(2056394534);
                        BentoBaseRowState.Start.PictogramPog pictogramPog2 = new BentoBaseRowState.Start.PictogramPog(ServerToBentoAssetMapper3.DOLLAR_SIGN, Color.m6701boximpl(BentoColor.INSTANCE.m21166getDayBg0d7_KjU()), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU()), null);
                        composerStartRestartGroup.endReplaceGroup();
                        textPog = pictogramPog2;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(2056375591);
                        textPog = new BentoBaseRowState.Start.TextPog(StringResources_androidKt.stringResource(C11595R.string.recurring_asset_category_selection_brokerage_cash_option_pog, new Object[]{NumberFormatter.DefaultImpls.formatNullable$default(Formats.getInterestRateFormatShort(), sweepsStatus.getSweepInterestRate(), null, 2, null)}, composerStartRestartGroup, 0), null, new BentoPogBackgroundOverride.ColorOverride(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU(), null), null, 10, null);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = i3;
                        modifier4 = modifier7;
                        str2 = null;
                    }
                    String strStringResource22 = StringResources_androidKt.stringResource(C11595R.string.recurring_asset_category_selection_brokerage_cash_option_primary, composerStartRestartGroup, 0);
                    if (sweepsStatus == null) {
                    }
                    if (brokerageCashSweepsState2 != 0) {
                    }
                    if (i10 == -1) {
                    }
                    composerStartRestartGroup.startReplaceGroup(2056436580);
                    strStringResource = StringResources_androidKt.stringResource(C11595R.string.f4032x902cf618, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowState bentoBaseRowState22 = new BentoBaseRowState(textPog, strStringResource22, strStringResource, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null);
                    i5 = -1633490746;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((i4 & 458752) == 131072) {
                    }
                    z4 = ((i4 & 3670016) == 1048576) | ((i4 & 458752) == 131072);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z4) {
                    }
                }
            } else {
                i4 = i3;
                modifier4 = modifier7;
                i5 = -1633490746;
                i6 = 1048576;
                i7 = 131072;
                i8 = 3670016;
                i9 = 458752;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2056453338);
            if (z3) {
                BentoBaseRowState bentoBaseRowState3 = new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.PictogramPog(ServerToBentoAssetMapper3.PRIME_CHART, Color.m6701boximpl(BentoColor.INSTANCE.m21166getDayBg0d7_KjU()), null, 4, null), StringResources_androidKt.stringResource(C11595R.string.f4035xe247e448, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C11595R.string.f4036xacf2ce3a, composerStartRestartGroup, 0), (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null);
                composerStartRestartGroup.startReplaceGroup(i5);
                boolean z5 = ((i4 & i9) == i7) | ((i4 & i8) == i6);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecurringAssetCategorySelectionV2Composable7.BrokerageSectionOptions$lambda$17$lambda$16$lambda$15(str, function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState3, true, false, false, 0L, (Function0) objRememberedValue4, composer2, (BentoBaseRowState.$stable << 3) | 384, 57);
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringAssetCategorySelectionV2Composable7.BrokerageSectionOptions$lambda$18(modifier5, sweepsStatus, z, z2, z3, str, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void BrokerageSectionOptions$lambda$8(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrokerageSectionOptions$lambda$17$lambda$10$lambda$9(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
        Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
        BrokerageSectionOptions$lambda$8(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrokerageSectionOptions$lambda$17$lambda$13$lambda$12(String str, Function1 function1) {
        if (str != null) {
            function1.invoke(new RecurringInvestmentCategory.BrokerageCash(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrokerageSectionOptions$lambda$17$lambda$16$lambda$15(String str, Function1 function1) {
        if (str != null) {
            function1.invoke(new RecurringInvestmentCategory.Investments(str));
        }
        return Unit.INSTANCE;
    }

    private static final void RetirementSectionTitle(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-216139479);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-216139479, i3, -1, "com.robinhood.android.common.recurring.assetSelection.RetirementSectionTitle (RecurringAssetCategorySelectionV2Composable.kt:284)");
            }
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11595R.string.recurring_asset_category_selection_retirement_section_title, composerStartRestartGroup, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, i3 & 14, 1), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), composer2, 24576, 0, 8172);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringAssetCategorySelectionV2Composable7.RetirementSectionTitle$lambda$19(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RetirementSetUpCard(Modifier modifier, final BigDecimal bigDecimal, final Function1<? super RecurringInvestmentCategory2, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1697492829);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(bigDecimal) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1697492829, i3, -1, "com.robinhood.android.common.recurring.assetSelection.RetirementSetUpCard (RecurringAssetCategorySelectionV2Composable.kt:298)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, i3 & 14, 0);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CardKt.m5548CardFjzlyU(null, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), 0L, null, C2002Dp.m7995constructorimpl(2), ComposableLambda3.rememberComposableLambda(-1555705580, true, new RecurringAssetCategorySelectionV2Composable8(function1, bigDecimal), composerStartRestartGroup, 54), composerStartRestartGroup, 1769472, 25);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringAssetCategorySelectionV2Composable7.RetirementSetUpCard$lambda$21(modifier3, bigDecimal, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RetirementSectionOptions(Modifier modifier, final boolean z, final boolean z2, final BigDecimal bigDecimal, final Money money, final Money money2, final String str, final String str2, final Function1<? super RecurringInvestmentCategory, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        Composer composer3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(628687475);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(bigDecimal) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(money) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(money2) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 8388608 : 4194304;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
        }
        int i9 = i3;
        if ((38347923 & i9) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
            modifier3 = modifier;
        } else {
            Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(628687475, i9, -1, "com.robinhood.android.common.recurring.assetSelection.RetirementSectionOptions (RecurringAssetCategorySelectionV2Composable.kt:365)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1252155502);
            if (z2) {
                i5 = 234881024;
                BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.PictogramPog(ServerToBentoAssetMapper3.RETIREMENT, null, null, 6, null), StringResources_androidKt.stringResource(C11595R.string.f4037x51537cda, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C11595R.string.f4038x877a8a4c, new Object[]{NumberFormatter.DefaultImpls.formatNullable$default(Formats.getInterestRateFormatShort(), bigDecimal, null, 2, null), Money3.formatOrDefault$default(money2, null, null, 3, null)}, composerStartRestartGroup, 0), (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z3 = ((29360128 & i9) == 8388608) | ((i9 & 234881024) == 67108864);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecurringAssetCategorySelectionV2Composable7.RetirementSectionOptions$lambda$29$lambda$25$lambda$24(str2, function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = modifier4;
                i6 = 0;
                i7 = 2;
                i4 = i9;
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, true, false, false, 0L, (Function0) objRememberedValue, composerStartRestartGroup, (BentoBaseRowState.$stable << 3) | 384, 57);
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                i4 = i9;
                modifier2 = modifier4;
                i5 = 234881024;
                i6 = 0;
                i7 = 2;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1252188692);
            if (z) {
                BentoBaseRowState bentoBaseRowState2 = new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.PictogramPog(ServerToBentoAssetMapper3.RETIREMENT, null, null, 6, null), StringResources_androidKt.stringResource(C11595R.string.f4039xd5350619, composer2, i6), StringResources_androidKt.stringResource(C11595R.string.f4040x991ebfcb, new Object[]{NumberFormatter.DefaultImpls.formatNullable$default(Formats.getInterestRateFormatShort(), bigDecimal, null, i7, null), Money3.formatOrDefault$default(money, null, null, 3, null)}, composer2, i6), (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null);
                composer2.startReplaceGroup(-1633490746);
                int i10 = ((3670016 & i4) == 1048576 ? 1 : i6) | ((i4 & i5) != 67108864 ? i6 : 1);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (i10 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecurringAssetCategorySelectionV2Composable7.RetirementSectionOptions$lambda$29$lambda$28$lambda$27(str, function1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                composer3 = composer2;
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState2, true, false, false, 0L, (Function0) objRememberedValue2, composer3, (BentoBaseRowState.$stable << 3) | 384, 57);
            } else {
                composer3 = composer2;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringAssetCategorySelectionV2Composable7.RetirementSectionOptions$lambda$30(modifier3, z, z2, bigDecimal, money, money2, str, str2, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementSectionOptions$lambda$29$lambda$25$lambda$24(String str, Function1 function1) {
        if (str != null) {
            function1.invoke(new RecurringInvestmentCategory.TraditionalIra(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementSectionOptions$lambda$29$lambda$28$lambda$27(String str, Function1 function1) {
        if (str != null) {
            function1.invoke(new RecurringInvestmentCategory.RothIra(str));
        }
        return Unit.INSTANCE;
    }

    private static final void Disclosure(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1208795018);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1208795018, i3, -1, "com.robinhood.android.common.recurring.assetSelection.Disclosure (RecurringAssetCategorySelectionV2Composable.kt:418)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecurringAssetCategorySelectionV2Composable7.Disclosure$lambda$32$lambda$31(context, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            UriHandleContent.UriHandleContent((Function1) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1219390025, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt.Disclosure.2
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
                        ComposerKt.traceEventStart(-1219390025, i5, -1, "com.robinhood.android.common.recurring.assetSelection.Disclosure.<anonymous> (RecurringAssetCategorySelectionV2Composable.kt:425)");
                    }
                    int i6 = C11595R.string.recurring_asset_category_selection_with_retirement_disclosure;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i6, bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU(), 0L, (LinkInteractionListener) null, composer2, 0, 12), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier, 0.0f, bentoTheme.getSpacing(composer2, i7).m21596getXxlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 5, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringAssetCategorySelectionV2Composable7.Disclosure$lambda$33(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Disclosure$lambda$32$lambda$31(Context context, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebUtils.viewUrl$default(context, url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1955529632);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1955529632, i, -1, "com.robinhood.android.common.recurring.assetSelection.Preview (RecurringAssetCategorySelectionV2Composable.kt:443)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, RecurringAssetCategorySelectionV2Composable2.INSTANCE.getLambda$622798168$feature_lib_recurring_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringAssetCategorySelectionV2Composable7.Preview$lambda$34(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-586110172);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-586110172, i, -1, "com.robinhood.android.common.recurring.assetSelection.PreviewNight (RecurringAssetCategorySelectionV2Composable.kt:477)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, RecurringAssetCategorySelectionV2Composable2.INSTANCE.m12354getLambda$1872176020$feature_lib_recurring_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionV2ComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringAssetCategorySelectionV2Composable7.PreviewNight$lambda$35(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final RecurringAssetCategorySelectionV2Composable getBrokerageCashSweepsState(SweepsStatus sweepsStatus) {
        ApiSweepEnrollment sweepEnrollment;
        if (sweepsStatus != null && !sweepsStatus.getSweepEligible()) {
            return RecurringAssetCategorySelectionV2Composable.INELIGIBLE;
        }
        if (sweepsStatus != null && (sweepEnrollment = sweepsStatus.getSweepEnrollment()) != null && !sweepEnrollment.getSweepEnrolled() && sweepsStatus.getSweepEligible()) {
            return RecurringAssetCategorySelectionV2Composable.ELIGIBLE_NOT_ENROLLED;
        }
        return RecurringAssetCategorySelectionV2Composable.ACTIVE;
    }
}
