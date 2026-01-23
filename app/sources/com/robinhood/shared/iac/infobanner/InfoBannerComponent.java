package com.robinhood.shared.iac.infobanner;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.shared.data.store.iac.IacInfoBannersBatchParams;
import com.robinhood.shared.iac.extensions.IacInfoBannerComposable;
import com.robinhood.shared.iac.infobanner.InfoBannerViewState;
import com.robinhood.utils.Preconditions;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Job;

/* compiled from: InfoBannerComponent.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u009f\u0001\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a/\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0018\u001a\u009d\u0001\u0010\u0019\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\u001c\u001aW\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030$2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010%\u001a2\u0010&\u001a\u00020\u0003*\u00020'2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006(²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002"}, m3636d2 = {"NoInfoBannerTestTag", "", "InfoBannerComponent", "", "accountNumber", "location", "Lcom/robinhood/models/db/IacInfoBannerLocation;", "modifier", "Landroidx/compose/ui/Modifier;", "instrumentId", "Ljava/util/UUID;", "currencyPairId", "perpetualContractId", "optionChainId", "listId", "eventId", "futuresContractId", "optionStrategyCode", "padding", "Landroidx/compose/foundation/layout/PaddingValues;", "coordinator", "Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxo;", "(Ljava/lang/String;Lcom/robinhood/models/db/IacInfoBannerLocation;Landroidx/compose/ui/Modifier;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Landroidx/compose/foundation/layout/PaddingValues;Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxo;Landroidx/compose/runtime/Composer;III)V", "InfoBannerComponentWithCoordinator", "(Lcom/robinhood/models/db/IacInfoBannerLocation;Landroidx/compose/foundation/layout/PaddingValues;Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InfoBannerComponentStandalone", "duxo", "Lcom/robinhood/shared/iac/infobanner/InfoBannerDuxo;", "(Ljava/lang/String;Lcom/robinhood/models/db/IacInfoBannerLocation;Landroidx/compose/ui/Modifier;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Landroidx/compose/foundation/layout/PaddingValues;Lcom/robinhood/shared/iac/infobanner/InfoBannerDuxo;Landroidx/compose/runtime/Composer;III)V", "InfoBannerContent", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/db/IacInfoBanner;", "onTapBanner", "Lkotlin/Function2;", "Lcom/robinhood/models/serverdriven/db/GenericAction$DeeplinkAction;", "onDismissBanner", "Lkotlin/Function1;", "(Lcom/robinhood/models/db/IacInfoBanner;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "infoBanner", "Landroidx/compose/foundation/lazy/LazyListScope;", "lib-iac-info-banner_externalDebug", "coordinatorViewState", "Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxoViewState;", "viewState", "Lcom/robinhood/shared/iac/infobanner/InfoBannerViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class InfoBannerComponent {
    public static final String NoInfoBannerTestTag = "no_info_banner";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoBannerComponent$lambda$0(String str, IacInfoBannerLocation iacInfoBannerLocation, Modifier modifier, UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, UUID uuid5, UUID uuid6, UUID uuid7, String str2, PaddingValues paddingValues, DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo, int i, int i2, int i3, Composer composer, int i4) {
        InfoBannerComponent(str, iacInfoBannerLocation, modifier, uuid, uuid2, uuid3, uuid4, uuid5, uuid6, uuid7, str2, paddingValues, dashboardInfoBannerCoordinatorDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoBannerComponentStandalone$lambda$15(String str, IacInfoBannerLocation iacInfoBannerLocation, Modifier modifier, UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, UUID uuid5, UUID uuid6, UUID uuid7, String str2, PaddingValues paddingValues, InfoBannerDuxo infoBannerDuxo, int i, int i2, int i3, Composer composer, int i4) {
        InfoBannerComponentStandalone(str, iacInfoBannerLocation, modifier, uuid, uuid2, uuid3, uuid4, uuid5, uuid6, uuid7, str2, paddingValues, infoBannerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoBannerComponentWithCoordinator$lambda$6(IacInfoBannerLocation iacInfoBannerLocation, PaddingValues paddingValues, DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InfoBannerComponentWithCoordinator(iacInfoBannerLocation, paddingValues, dashboardInfoBannerCoordinatorDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoBannerContent$lambda$16(IacInfoBanner iacInfoBanner, PaddingValues paddingValues, Function2 function2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InfoBannerContent(iacInfoBanner, paddingValues, function2, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InfoBannerComponent(final String str, final IacInfoBannerLocation location, Modifier modifier, UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, UUID uuid5, UUID uuid6, UUID uuid7, String str2, PaddingValues paddingValues, DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        UUID uuid8;
        int i6;
        UUID uuid9;
        int i7;
        UUID uuid10;
        int i8;
        UUID uuid11;
        int i9;
        UUID uuid12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default;
        PaddingValues paddingValues2;
        Modifier modifier3;
        UUID uuid13;
        UUID uuid14;
        UUID uuid15;
        UUID uuid16;
        UUID uuid17;
        UUID uuid18;
        UUID uuid19;
        String str3;
        int i19;
        DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo2;
        DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo3;
        Composer composer2;
        final DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo4;
        final Modifier modifier4;
        final UUID uuid20;
        final UUID uuid21;
        final UUID uuid22;
        final UUID uuid23;
        final UUID uuid24;
        final UUID uuid25;
        final UUID uuid26;
        final String str4;
        final PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(location, "location");
        Composer composerStartRestartGroup = composer.startRestartGroup(2072472796);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(location.ordinal()) ? 32 : 16;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    uuid8 = uuid;
                    i4 |= composerStartRestartGroup.changedInstance(uuid8) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        uuid9 = uuid2;
                        i4 |= composerStartRestartGroup.changedInstance(uuid9) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        uuid10 = uuid3;
                    } else {
                        uuid10 = uuid3;
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(uuid10) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        uuid11 = uuid4;
                    } else {
                        uuid11 = uuid4;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(uuid11) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        uuid12 = uuid5;
                    } else {
                        uuid12 = uuid5;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(uuid12) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i11 = i10;
                            i4 |= composerStartRestartGroup.changedInstance(uuid6) ? 67108864 : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 == 0) {
                            if ((i & 805306368) == 0) {
                                i13 = i12;
                                i4 |= composerStartRestartGroup.changedInstance(uuid7) ? 536870912 : 268435456;
                            }
                            i14 = i3 & 1024;
                            if (i14 == 0) {
                                i16 = i2 | 6;
                                i15 = i14;
                            } else if ((i2 & 6) == 0) {
                                i15 = i14;
                                i16 = i2 | (composerStartRestartGroup.changed(str2) ? 4 : 2);
                            } else {
                                i15 = i14;
                                i16 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i16 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 32 : 16;
                            }
                            int i21 = i16;
                            i17 = i3 & 4096;
                            if (i17 == 0) {
                                i18 = i21 | 384;
                            } else {
                                int i22 = i21;
                                if ((i2 & 384) == 0) {
                                    i22 |= composerStartRestartGroup.changedInstance(dashboardInfoBannerCoordinatorDuxo) ? 256 : 128;
                                }
                                i18 = i22;
                            }
                            if ((i4 & 306783379) == 306783378 || (i18 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier5 = i20 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i5 != 0) {
                                        uuid8 = null;
                                    }
                                    if (i6 != 0) {
                                        uuid9 = null;
                                    }
                                    if (i7 != 0) {
                                        uuid10 = null;
                                    }
                                    if (i8 != 0) {
                                        uuid11 = null;
                                    }
                                    if (i9 != 0) {
                                        uuid12 = null;
                                    }
                                    UUID uuid27 = i11 == 0 ? null : uuid6;
                                    UUID uuid28 = i13 == 0 ? null : uuid7;
                                    String str5 = i15 == 0 ? null : str2;
                                    if ((i3 & 2048) == 0) {
                                        paddingValuesM5139PaddingValuesa9UjIt4$default = PaddingKt.m5139PaddingValuesa9UjIt4$default(((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 2, null);
                                        i18 &= -113;
                                    } else {
                                        paddingValuesM5139PaddingValuesa9UjIt4$default = paddingValues;
                                    }
                                    paddingValues2 = paddingValuesM5139PaddingValuesa9UjIt4$default;
                                    modifier3 = modifier5;
                                    uuid13 = uuid8;
                                    if (i17 == 0) {
                                        uuid14 = uuid9;
                                        uuid15 = uuid27;
                                        uuid16 = uuid10;
                                        uuid17 = uuid11;
                                        uuid18 = uuid28;
                                        uuid19 = uuid12;
                                        str3 = str5;
                                        dashboardInfoBannerCoordinatorDuxo2 = null;
                                    } else {
                                        uuid14 = uuid9;
                                        uuid15 = uuid27;
                                        uuid16 = uuid10;
                                        uuid17 = uuid11;
                                        uuid18 = uuid28;
                                        uuid19 = uuid12;
                                        str3 = str5;
                                        i19 = 2072472796;
                                        dashboardInfoBannerCoordinatorDuxo2 = dashboardInfoBannerCoordinatorDuxo;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(i19, i4, i18, "com.robinhood.shared.iac.infobanner.InfoBannerComponent (InfoBannerComponent.kt:50)");
                                        }
                                        if (dashboardInfoBannerCoordinatorDuxo2 == null) {
                                            composerStartRestartGroup.startReplaceGroup(882952609);
                                            DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo5 = dashboardInfoBannerCoordinatorDuxo2;
                                            PaddingValues paddingValues4 = paddingValues2;
                                            InfoBannerComponentWithCoordinator(location, paddingValues4, dashboardInfoBannerCoordinatorDuxo5, modifier3, composerStartRestartGroup, (i18 & 896) | ((i4 >> 3) & 14) | (i18 & 112) | ((i4 << 3) & 7168), 0);
                                            dashboardInfoBannerCoordinatorDuxo3 = dashboardInfoBannerCoordinatorDuxo5;
                                            composer2 = composerStartRestartGroup;
                                            composer2.endReplaceGroup();
                                        } else {
                                            dashboardInfoBannerCoordinatorDuxo3 = dashboardInfoBannerCoordinatorDuxo2;
                                            composer2 = composerStartRestartGroup;
                                            composer2.startReplaceGroup(883164742);
                                            InfoBannerComponentStandalone(str, location, modifier3, uuid13, uuid14, uuid16, uuid17, uuid19, uuid15, uuid18, str3, paddingValues2, null, composer2, i4 & 2147483646, i18 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4096);
                                            composer2.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        dashboardInfoBannerCoordinatorDuxo4 = dashboardInfoBannerCoordinatorDuxo3;
                                        modifier4 = modifier3;
                                        uuid20 = uuid13;
                                        uuid21 = uuid14;
                                        uuid22 = uuid16;
                                        uuid23 = uuid17;
                                        uuid24 = uuid19;
                                        uuid25 = uuid15;
                                        uuid26 = uuid18;
                                        str4 = str3;
                                        paddingValues3 = paddingValues2;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 2048) != 0) {
                                        i18 &= -113;
                                    }
                                    uuid15 = uuid6;
                                    uuid18 = uuid7;
                                    str3 = str2;
                                    paddingValues2 = paddingValues;
                                    dashboardInfoBannerCoordinatorDuxo2 = dashboardInfoBannerCoordinatorDuxo;
                                    uuid13 = uuid8;
                                    uuid14 = uuid9;
                                    uuid16 = uuid10;
                                    uuid17 = uuid11;
                                    uuid19 = uuid12;
                                    modifier3 = modifier2;
                                }
                                i19 = 2072472796;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (dashboardInfoBannerCoordinatorDuxo2 == null) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                dashboardInfoBannerCoordinatorDuxo4 = dashboardInfoBannerCoordinatorDuxo3;
                                modifier4 = modifier3;
                                uuid20 = uuid13;
                                uuid21 = uuid14;
                                uuid22 = uuid16;
                                uuid23 = uuid17;
                                uuid24 = uuid19;
                                uuid25 = uuid15;
                                uuid26 = uuid18;
                                str4 = str3;
                                paddingValues3 = paddingValues2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                str4 = str2;
                                composer2 = composerStartRestartGroup;
                                uuid20 = uuid8;
                                uuid21 = uuid9;
                                uuid22 = uuid10;
                                uuid23 = uuid11;
                                uuid24 = uuid12;
                                modifier4 = modifier2;
                                uuid25 = uuid6;
                                uuid26 = uuid7;
                                paddingValues3 = paddingValues;
                                dashboardInfoBannerCoordinatorDuxo4 = dashboardInfoBannerCoordinatorDuxo;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return InfoBannerComponent.InfoBannerComponent$lambda$0(str, location, modifier4, uuid20, uuid21, uuid22, uuid23, uuid24, uuid25, uuid26, str4, paddingValues3, dashboardInfoBannerCoordinatorDuxo4, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        i13 = i12;
                        i14 = i3 & 1024;
                        if (i14 == 0) {
                        }
                        if ((i2 & 48) == 0) {
                        }
                        int i212 = i16;
                        i17 = i3 & 4096;
                        if (i17 == 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i20 == 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
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
                                if ((i3 & 2048) == 0) {
                                }
                                paddingValues2 = paddingValuesM5139PaddingValuesa9UjIt4$default;
                                modifier3 = modifier5;
                                uuid13 = uuid8;
                                if (i17 == 0) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 512;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    int i2122 = i16;
                    i17 = i3 & 4096;
                    if (i17 == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                uuid9 = uuid2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i21222 = i16;
                i17 = i3 & 4096;
                if (i17 == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            uuid8 = uuid;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            uuid9 = uuid2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i212222 = i16;
            i17 = i3 & 4096;
            if (i17 == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        uuid8 = uuid;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        uuid9 = uuid2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i2122222 = i16;
        i17 = i3 & 4096;
        if (i17 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void InfoBannerComponentWithCoordinator(final IacInfoBannerLocation iacInfoBannerLocation, final PaddingValues paddingValues, final DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-703985527);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(iacInfoBannerLocation.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(paddingValues) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dashboardInfoBannerCoordinatorDuxo) ? 256 : 128;
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
                    ComposerKt.traceEventStart(-703985527, i3, -1, "com.robinhood.shared.iac.infobanner.InfoBannerComponentWithCoordinator (InfoBannerComponent.kt:83)");
                }
                IacInfoBanner iacInfoBanner = InfoBannerComponentWithCoordinator$lambda$1(FlowExtKt.collectAsStateWithLifecycle(dashboardInfoBannerCoordinatorDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)).getBannersByLocation().get(iacInfoBannerLocation);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(dashboardInfoBannerCoordinatorDuxo);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function2() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InfoBannerComponent.InfoBannerComponentWithCoordinator$lambda$3$lambda$2(dashboardInfoBannerCoordinatorDuxo, (UUID) obj, (GenericAction.DeeplinkAction) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function2 function2 = (Function2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(dashboardInfoBannerCoordinatorDuxo) | ((i3 & 14) != 4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InfoBannerComponent.InfoBannerComponentWithCoordinator$lambda$5$lambda$4(dashboardInfoBannerCoordinatorDuxo, iacInfoBannerLocation, (UUID) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                InfoBannerContent(iacInfoBanner, paddingValues, function2, (Function1) objRememberedValue2, modifier5, composerStartRestartGroup, (i3 & 112) | ((i3 << 3) & 57344), 0);
                composerStartRestartGroup = composerStartRestartGroup;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InfoBannerComponent.InfoBannerComponentWithCoordinator$lambda$6(iacInfoBannerLocation, paddingValues, dashboardInfoBannerCoordinatorDuxo, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            IacInfoBanner iacInfoBanner2 = InfoBannerComponentWithCoordinator$lambda$1(FlowExtKt.collectAsStateWithLifecycle(dashboardInfoBannerCoordinatorDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)).getBannersByLocation().get(iacInfoBannerLocation);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(dashboardInfoBannerCoordinatorDuxo);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function2() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InfoBannerComponent.InfoBannerComponentWithCoordinator$lambda$3$lambda$2(dashboardInfoBannerCoordinatorDuxo, (UUID) obj, (GenericAction.DeeplinkAction) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                Function2 function22 = (Function2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(dashboardInfoBannerCoordinatorDuxo) | ((i3 & 14) != 4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InfoBannerComponent.InfoBannerComponentWithCoordinator$lambda$5$lambda$4(dashboardInfoBannerCoordinatorDuxo, iacInfoBannerLocation, (UUID) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    InfoBannerContent(iacInfoBanner2, paddingValues, function22, (Function1) objRememberedValue2, modifier52, composerStartRestartGroup, (i3 & 112) | ((i3 << 3) & 57344), 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final InfoBannerViewState InfoBannerComponentStandalone$lambda$7(SnapshotState4<? extends InfoBannerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final DashboardInfoBannerCoordinatorDuxoViewState InfoBannerComponentWithCoordinator$lambda$1(SnapshotState4<DashboardInfoBannerCoordinatorDuxoViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoBannerComponentWithCoordinator$lambda$3$lambda$2(DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo, UUID receiptUuid, GenericAction.DeeplinkAction action) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(action, "action");
        dashboardInfoBannerCoordinatorDuxo.tapInfoBanner(receiptUuid, action);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoBannerComponentWithCoordinator$lambda$5$lambda$4(DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo, IacInfoBannerLocation iacInfoBannerLocation, UUID receiptUuid) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        dashboardInfoBannerCoordinatorDuxo.dismissInfoBanner(iacInfoBannerLocation, receiptUuid, IacDismissMethod.PASSIVE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InfoBannerComponentStandalone(final String str, final IacInfoBannerLocation location, Modifier modifier, UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, UUID uuid5, UUID uuid6, UUID uuid7, String str2, PaddingValues paddingValues, InfoBannerDuxo infoBannerDuxo, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        UUID uuid8;
        int i7;
        UUID uuid9;
        int i8;
        UUID uuid10;
        int i9;
        UUID uuid11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Modifier modifier3;
        PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default;
        int i17;
        PaddingValues paddingValues2;
        InfoBannerDuxo infoBannerDuxo2;
        int i18;
        UUID uuid12;
        UUID uuid13;
        UUID uuid14;
        UUID uuid15;
        UUID uuid16;
        Modifier modifier4;
        Composer composer2;
        UUID uuid17;
        String str3;
        final IacInfoBannersBatchParams iacInfoBannersBatchParams;
        Composer composer3;
        InfoBannerViewState infoBannerViewStateInfoBannerComponentStandalone$lambda$7;
        final InfoBannerDuxo infoBannerDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        final PaddingValues paddingValues3;
        Composer composer4;
        final String str4;
        final UUID uuid18;
        final UUID uuid19;
        final UUID uuid20;
        final Modifier modifier5;
        final UUID uuid21;
        final UUID uuid22;
        final UUID uuid23;
        final UUID uuid24;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(location, "location");
        Composer composerStartRestartGroup = composer.startRestartGroup(152990441);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(location.ordinal()) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(uuid) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        uuid8 = uuid2;
                        i4 |= composerStartRestartGroup.changedInstance(uuid8) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        uuid9 = uuid3;
                    } else {
                        uuid9 = uuid3;
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(uuid9) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        uuid10 = uuid4;
                    } else {
                        uuid10 = uuid4;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(uuid10) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        uuid11 = uuid5;
                    } else {
                        uuid11 = uuid5;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(uuid11) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i11 = i10;
                            i4 |= composerStartRestartGroup.changedInstance(uuid6) ? 67108864 : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 == 0) {
                            if ((i & 805306368) == 0) {
                                i13 = i12;
                                i4 |= composerStartRestartGroup.changedInstance(uuid7) ? 536870912 : 268435456;
                            }
                            i14 = i3 & 1024;
                            if (i14 == 0) {
                                i16 = i2 | 6;
                                i15 = i14;
                            } else if ((i2 & 6) == 0) {
                                i15 = i14;
                                i16 = i2 | (composerStartRestartGroup.changed(str2) ? 4 : 2);
                            } else {
                                i15 = i14;
                                i16 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i16 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 32 : 16;
                            }
                            if ((i2 & 384) == 0) {
                                i16 |= ((i3 & 4096) == 0 && composerStartRestartGroup.changedInstance(infoBannerDuxo)) ? 256 : 128;
                            }
                            int i20 = i16;
                            if ((i4 & 306783379) != 306783378 && (i20 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                str4 = str2;
                                composer4 = composerStartRestartGroup;
                                uuid20 = uuid8;
                                uuid23 = uuid9;
                                uuid19 = uuid10;
                                uuid22 = uuid11;
                                modifier5 = modifier2;
                                uuid24 = uuid;
                                uuid18 = uuid6;
                                uuid21 = uuid7;
                                paddingValues3 = paddingValues;
                                infoBannerDuxo3 = infoBannerDuxo;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                IacInfoBanner infoBanner = null;
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier6 = i19 == 0 ? Modifier.INSTANCE : modifier2;
                                    UUID uuid25 = i5 == 0 ? null : uuid;
                                    if (i6 != 0) {
                                        uuid8 = null;
                                    }
                                    if (i7 != 0) {
                                        uuid9 = null;
                                    }
                                    if (i8 != 0) {
                                        uuid10 = null;
                                    }
                                    if (i9 != 0) {
                                        uuid11 = null;
                                    }
                                    UUID uuid26 = i11 == 0 ? null : uuid6;
                                    UUID uuid27 = i13 == 0 ? null : uuid7;
                                    String str5 = i15 == 0 ? null : str2;
                                    if ((i3 & 2048) == 0) {
                                        modifier3 = modifier6;
                                        paddingValuesM5139PaddingValuesa9UjIt4$default = PaddingKt.m5139PaddingValuesa9UjIt4$default(((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 2, null);
                                        i17 = i20 & (-113);
                                    } else {
                                        modifier3 = modifier6;
                                        paddingValuesM5139PaddingValuesa9UjIt4$default = paddingValues;
                                        i17 = i20;
                                    }
                                    PaddingValues paddingValues4 = paddingValuesM5139PaddingValuesa9UjIt4$default;
                                    if ((i3 & 4096) == 0) {
                                        String serverValue = location.getServerValue();
                                        StringBuilder sb = new StringBuilder();
                                        UUID uuid28 = uuid25;
                                        sb.append("info_banner_");
                                        sb.append(serverValue);
                                        sb.append("_");
                                        sb.append(str);
                                        String string2 = sb.toString();
                                        composerStartRestartGroup.startReplaceGroup(-747520797);
                                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                        if (current == null) {
                                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        }
                                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InfoBannerDuxo.class), current, string2, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$InfoBannerComponentStandalone$$inlined$duxo$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                                    lifecycle.addObserver(duxoLifecycleObserver);
                                                    final Lifecycle lifecycle2 = lifecycle;
                                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$InfoBannerComponentStandalone$$inlined$duxo$1.1
                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                        public void dispose() {
                                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                                        }
                                                    };
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                                        composerStartRestartGroup.endReplaceGroup();
                                        infoBannerDuxo2 = (InfoBannerDuxo) baseDuxo;
                                        i18 = i17 & (-897);
                                        paddingValues2 = paddingValues4;
                                        uuid12 = uuid8;
                                        uuid13 = uuid26;
                                        uuid17 = uuid9;
                                        uuid14 = uuid27;
                                        uuid15 = uuid11;
                                        str3 = str5;
                                        composer2 = composerStartRestartGroup;
                                        uuid16 = uuid28;
                                        modifier4 = modifier3;
                                    } else {
                                        UUID uuid29 = uuid25;
                                        paddingValues2 = paddingValues4;
                                        infoBannerDuxo2 = infoBannerDuxo;
                                        i18 = i17;
                                        uuid12 = uuid8;
                                        uuid13 = uuid26;
                                        uuid14 = uuid27;
                                        uuid15 = uuid11;
                                        uuid16 = uuid29;
                                        modifier4 = modifier3;
                                        composer2 = composerStartRestartGroup;
                                        uuid17 = uuid9;
                                        str3 = str5;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 2048) != 0) {
                                        i20 &= -113;
                                    }
                                    if ((i3 & 4096) != 0) {
                                        i20 &= -897;
                                    }
                                    uuid14 = uuid7;
                                    paddingValues2 = paddingValues;
                                    infoBannerDuxo2 = infoBannerDuxo;
                                    i18 = i20;
                                    composer2 = composerStartRestartGroup;
                                    uuid12 = uuid8;
                                    uuid17 = uuid9;
                                    uuid15 = uuid11;
                                    modifier4 = modifier2;
                                    uuid16 = uuid;
                                    uuid13 = uuid6;
                                    str3 = str2;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(152990441, i4, i18, "com.robinhood.shared.iac.infobanner.InfoBannerComponentStandalone (InfoBannerComponent.kt:126)");
                                }
                                int i21 = i18;
                                InfoBannerDuxo infoBannerDuxo4 = infoBannerDuxo2;
                                composer3 = composer2;
                                int i22 = i4;
                                UUID uuid30 = uuid10;
                                iacInfoBannersBatchParams = new IacInfoBannersBatchParams(CollectionsKt.listOf(location), uuid16, uuid12, uuid17, uuid30, uuid15, uuid13, uuid14, str3, str, null, 1024, null);
                                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(infoBannerDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                                infoBannerViewStateInfoBannerComponentStandalone$lambda$7 = InfoBannerComponentStandalone$lambda$7(snapshotState4CollectAsStateWithLifecycle);
                                if (!(infoBannerViewStateInfoBannerComponentStandalone$lambda$7 instanceof InfoBannerViewState.Loaded)) {
                                    InfoBannerViewState infoBannerViewStateInfoBannerComponentStandalone$lambda$72 = InfoBannerComponentStandalone$lambda$7(snapshotState4CollectAsStateWithLifecycle);
                                    Intrinsics.checkNotNull(infoBannerViewStateInfoBannerComponentStandalone$lambda$72, "null cannot be cast to non-null type com.robinhood.shared.iac.infobanner.InfoBannerViewState.Loaded");
                                    infoBanner = ((InfoBannerViewState.Loaded) infoBannerViewStateInfoBannerComponentStandalone$lambda$72).getInfoBanner();
                                } else if (!(infoBannerViewStateInfoBannerComponentStandalone$lambda$7 instanceof InfoBannerViewState.None)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(5004770);
                                infoBannerDuxo3 = infoBannerDuxo4;
                                zChangedInstance = composer3.changedInstance(infoBannerDuxo3);
                                objRememberedValue = composer3.rememberedValue();
                                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function2() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return InfoBannerComponent.InfoBannerComponentStandalone$lambda$9$lambda$8(infoBannerDuxo3, (UUID) obj, (GenericAction.DeeplinkAction) obj2);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                Function2 function2 = (Function2) objRememberedValue;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(5004770);
                                zChangedInstance2 = composer3.changedInstance(infoBannerDuxo3);
                                objRememberedValue2 = composer3.rememberedValue();
                                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return InfoBannerComponent.InfoBannerComponentStandalone$lambda$11$lambda$10(infoBannerDuxo3, (UUID) obj);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceGroup();
                                Modifier modifier7 = modifier4;
                                PaddingValues paddingValues5 = paddingValues2;
                                InfoBannerContent(infoBanner, paddingValues5, function2, (Function1) objRememberedValue2, modifier7, composer3, (i21 & 112) | ((i22 << 6) & 57344), 0);
                                composer3.startReplaceGroup(-1633490746);
                                zChangedInstance3 = composer3.changedInstance(infoBannerDuxo3) | composer3.changedInstance(iacInfoBannersBatchParams);
                                objRememberedValue3 = composer3.rememberedValue();
                                if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return InfoBannerComponent.InfoBannerComponentStandalone$lambda$14$lambda$13(infoBannerDuxo3, iacInfoBannersBatchParams, (LifecycleResumePauseEffectScope) obj);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceGroup();
                                LifecycleEffectKt.LifecycleResumeEffect(iacInfoBannersBatchParams, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue3, composer3, 0, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                paddingValues3 = paddingValues5;
                                composer4 = composer3;
                                str4 = str3;
                                uuid18 = uuid13;
                                uuid19 = uuid30;
                                uuid20 = uuid12;
                                modifier5 = modifier7;
                                uuid21 = uuid14;
                                uuid22 = uuid15;
                                uuid23 = uuid17;
                                uuid24 = uuid16;
                            }
                            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return InfoBannerComponent.InfoBannerComponentStandalone$lambda$15(str, location, modifier5, uuid24, uuid20, uuid23, uuid19, uuid22, uuid18, uuid21, str4, paddingValues3, infoBannerDuxo3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        i13 = i12;
                        i14 = i3 & 1024;
                        if (i14 == 0) {
                        }
                        if ((i2 & 48) == 0) {
                        }
                        if ((i2 & 384) == 0) {
                        }
                        int i202 = i16;
                        if ((i4 & 306783379) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            IacInfoBanner infoBanner2 = null;
                            if ((i & 1) != 0) {
                                if (i19 == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 != 0) {
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
                                if ((i3 & 2048) == 0) {
                                }
                                PaddingValues paddingValues42 = paddingValuesM5139PaddingValuesa9UjIt4$default;
                                if ((i3 & 4096) == 0) {
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i212 = i18;
                                InfoBannerDuxo infoBannerDuxo42 = infoBannerDuxo2;
                                composer3 = composer2;
                                int i222 = i4;
                                UUID uuid302 = uuid10;
                                iacInfoBannersBatchParams = new IacInfoBannersBatchParams(CollectionsKt.listOf(location), uuid16, uuid12, uuid17, uuid302, uuid15, uuid13, uuid14, str3, str, null, 1024, null);
                                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(infoBannerDuxo42.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                                infoBannerViewStateInfoBannerComponentStandalone$lambda$7 = InfoBannerComponentStandalone$lambda$7(snapshotState4CollectAsStateWithLifecycle2);
                                if (!(infoBannerViewStateInfoBannerComponentStandalone$lambda$7 instanceof InfoBannerViewState.Loaded)) {
                                }
                                composer3.startReplaceGroup(5004770);
                                infoBannerDuxo3 = infoBannerDuxo42;
                                zChangedInstance = composer3.changedInstance(infoBannerDuxo3);
                                objRememberedValue = composer3.rememberedValue();
                                if (!zChangedInstance) {
                                    objRememberedValue = new Function2() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return InfoBannerComponent.InfoBannerComponentStandalone$lambda$9$lambda$8(infoBannerDuxo3, (UUID) obj, (GenericAction.DeeplinkAction) obj2);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue);
                                    Function2 function22 = (Function2) objRememberedValue;
                                    composer3.endReplaceGroup();
                                    composer3.startReplaceGroup(5004770);
                                    zChangedInstance2 = composer3.changedInstance(infoBannerDuxo3);
                                    objRememberedValue2 = composer3.rememberedValue();
                                    if (!zChangedInstance2) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return InfoBannerComponent.InfoBannerComponentStandalone$lambda$11$lambda$10(infoBannerDuxo3, (UUID) obj);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue2);
                                        composer3.endReplaceGroup();
                                        Modifier modifier72 = modifier4;
                                        PaddingValues paddingValues52 = paddingValues2;
                                        InfoBannerContent(infoBanner2, paddingValues52, function22, (Function1) objRememberedValue2, modifier72, composer3, (i212 & 112) | ((i222 << 6) & 57344), 0);
                                        composer3.startReplaceGroup(-1633490746);
                                        zChangedInstance3 = composer3.changedInstance(infoBannerDuxo3) | composer3.changedInstance(iacInfoBannersBatchParams);
                                        objRememberedValue3 = composer3.rememberedValue();
                                        if (!zChangedInstance3) {
                                            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return InfoBannerComponent.InfoBannerComponentStandalone$lambda$14$lambda$13(infoBannerDuxo3, iacInfoBannersBatchParams, (LifecycleResumePauseEffectScope) obj);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue3);
                                            composer3.endReplaceGroup();
                                            LifecycleEffectKt.LifecycleResumeEffect(iacInfoBannersBatchParams, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue3, composer3, 0, 2);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            paddingValues3 = paddingValues52;
                                            composer4 = composer3;
                                            str4 = str3;
                                            uuid18 = uuid13;
                                            uuid19 = uuid302;
                                            uuid20 = uuid12;
                                            modifier5 = modifier72;
                                            uuid21 = uuid14;
                                            uuid22 = uuid15;
                                            uuid23 = uuid17;
                                            uuid24 = uuid16;
                                        }
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 512;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & 384) == 0) {
                    }
                    int i2022 = i16;
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                uuid8 = uuid2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & 384) == 0) {
                }
                int i20222 = i16;
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            uuid8 = uuid2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            int i202222 = i16;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        uuid8 = uuid2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        int i2022222 = i16;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoBannerComponentStandalone$lambda$9$lambda$8(InfoBannerDuxo infoBannerDuxo, UUID receiptUuid, GenericAction.DeeplinkAction action) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(action, "action");
        infoBannerDuxo.tapInfoBanner(receiptUuid, action);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoBannerComponentStandalone$lambda$11$lambda$10(InfoBannerDuxo infoBannerDuxo, UUID receiptUuid) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        infoBannerDuxo.dismissInfoBanner(receiptUuid, IacDismissMethod.PASSIVE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult InfoBannerComponentStandalone$lambda$14$lambda$13(InfoBannerDuxo infoBannerDuxo, IacInfoBannersBatchParams iacInfoBannersBatchParams, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = infoBannerDuxo.bind(iacInfoBannersBatchParams);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$InfoBannerComponentStandalone$lambda$14$lambda$13$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void InfoBannerContent(final IacInfoBanner iacInfoBanner, final PaddingValues paddingValues, final Function2<? super UUID, ? super GenericAction.DeeplinkAction, Unit> function2, final Function1<? super UUID, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-182050639);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(iacInfoBanner) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(paddingValues) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-182050639, i3, -1, "com.robinhood.shared.iac.infobanner.InfoBannerContent (InfoBannerComponent.kt:179)");
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                if (iacInfoBanner == null) {
                    composerStartRestartGroup.startReplaceGroup(1073517167);
                    IacInfoBannerComposable.IacInfoBannerComposable(PaddingKt.padding(modifier3, paddingValues), iacInfoBanner, new InfoBannerCallbacks() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt.InfoBannerContent.1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
                        public void onClickInfoBanner(IacInfoBanner banner) {
                            Intrinsics.checkNotNullParameter(banner, "banner");
                            GenericAction ctaAction = banner.getCtaAction();
                            if (ctaAction instanceof GenericAction.DeeplinkAction) {
                                Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((GenericAction.DeeplinkAction) ctaAction).getUri(), null, null, false, null, 60, null);
                                function2.invoke(banner.getReceiptUuid(), ctaAction);
                                return;
                            }
                            if (ctaAction instanceof GenericAction.DismissAction) {
                                function1.invoke(banner.getReceiptUuid());
                                return;
                            }
                            if (ctaAction != null) {
                                if (!(ctaAction instanceof GenericAction.ButtonsAction) && !(ctaAction instanceof GenericAction.CancelCryptoPendingOrdersAction) && !(ctaAction instanceof GenericAction.ClaimPspAction) && !(ctaAction instanceof GenericAction.GoldDowngradeAction) && !(ctaAction instanceof GenericAction.InfoAlertAction) && !(ctaAction instanceof GenericAction.OrderCheckAction) && !(ctaAction instanceof GenericAction.ShareSnapshotAction) && !(ctaAction instanceof GenericAction.DisableMarginWithdrawalAction)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Preconditions.INSTANCE.failUnexpectedItemKotlin(ctaAction);
                                throw new ExceptionsH();
                            }
                        }

                        @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
                        public void onDismissInfoBanner(IacInfoBanner banner) {
                            Intrinsics.checkNotNullParameter(banner, "banner");
                            function1.invoke(banner.getReceiptUuid());
                        }
                    }, composerStartRestartGroup, (i3 << 3) & 112, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1075212154);
                    Spacer2.Spacer(TestTag3.testTag(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(1)), NoInfoBannerTestTag), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InfoBannerComponent.InfoBannerContent$lambda$16(iacInfoBanner, paddingValues, function2, function1, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (iacInfoBanner == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static /* synthetic */ void infoBanner$default(LazyListScope lazyListScope, Modifier modifier, String str, IacInfoBannerLocation iacInfoBannerLocation, DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo, int i, Object obj) {
        if ((i & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i & 8) != 0) {
            dashboardInfoBannerCoordinatorDuxo = null;
        }
        infoBanner(lazyListScope, modifier, str, iacInfoBannerLocation, dashboardInfoBannerCoordinatorDuxo);
    }

    public static final void infoBanner(LazyListScope lazyListScope, final Modifier modifier, final String str, final IacInfoBannerLocation location, final DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(location, "location");
        LazyListScope.item$default(lazyListScope, "info_banner_" + location.getServerValue() + "_" + str, null, ComposableLambda3.composableLambdaInstance(176160717, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentKt.infoBanner.1
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
                    ComposerKt.traceEventStart(176160717, i, -1, "com.robinhood.shared.iac.infobanner.infoBanner.<anonymous> (InfoBannerComponent.kt:244)");
                }
                InfoBannerComponent.InfoBannerComponent(str, location, modifier, null, null, null, null, null, null, null, null, null, dashboardInfoBannerCoordinatorDuxo, composer, 0, 0, 4088);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
    }
}
