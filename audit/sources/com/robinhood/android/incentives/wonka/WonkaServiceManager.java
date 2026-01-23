package com.robinhood.android.incentives.wonka;

import android.content.Context;
import com.robinhood.android.incentives.wonka.impression.AssetRetentionPromotionSeenPref;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.shared.common.microgramdeeplinklaunch.RealMicrogramDeeplinkService;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.service.ManagedServiceExtension2;
import microgram.contracts.service_incentives_wonka.proto.p504v1.IncentivesWonkaService;
import p479j$.time.Clock;

/* compiled from: WonkaServiceManager.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramManager", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Landroid/content/Context;", "context", "Lcom/robinhood/prefs/StringToLongMapPreference;", "assetRetentionPromotionSeenPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "sweepsInterestStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepEnrollmentStore", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Lcom/robinhood/prefs/StringToLongMapPreference;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;)V", "Lkotlinx/coroutines/CoroutineScope;", "lifecycleScope", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "microgramComponent", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService;", "clientService", "(Lkotlinx/coroutines/CoroutineScope;)Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService;", "Lcom/robinhood/android/incentives/wonka/TransferInteractionHandler;", "transferInteractionHandler", "", "enableMicrogramInteractions", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/incentives/wonka/TransferInteractionHandler;)V", "disableMicrogramInteractions", "()V", "", "retentionPeriodKey", "markAssetRetentionPromotionSeen", "(Ljava/lang/String;)V", "", "retentionPeriodSeconds", "", "eligibleForAssetRetentionPromotion", "(Ljava/lang/String;I)Z", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "Lcom/robinhood/android/navigation/Navigator;", "Landroid/content/Context;", "Lcom/robinhood/prefs/StringToLongMapPreference;", "Lj$/time/Clock;", "Lcom/robinhood/android/incentives/wonka/RealWonkaService;", "wonkaService", "Lcom/robinhood/android/incentives/wonka/RealWonkaService;", "Lmicrogram/android/MicrogramLaunchId;", "launchId", "Lmicrogram/android/MicrogramLaunchId;", "lib-wonka_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class WonkaServiceManager {
    private final StringToLongMapPreference assetRetentionPromotionSeenPref;
    private final Clock clock;
    private final Context context;
    private final MicrogramLaunchId launchId;
    private final MicrogramManager microgramManager;
    private final Navigator navigator;
    private final RealWonkaService wonkaService;

    public WonkaServiceManager(MicrogramManager microgramManager, Navigator navigator, Context context, @AssetRetentionPromotionSeenPref StringToLongMapPreference assetRetentionPromotionSeenPref, Clock clock, SweepsInterestStore sweepsInterestStore, SweepEnrollmentStore sweepEnrollmentStore) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetRetentionPromotionSeenPref, "assetRetentionPromotionSeenPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        this.microgramManager = microgramManager;
        this.navigator = navigator;
        this.context = context;
        this.assetRetentionPromotionSeenPref = assetRetentionPromotionSeenPref;
        this.clock = clock;
        RealWonkaService realWonkaService = new RealWonkaService(sweepsInterestStore, sweepEnrollmentStore);
        this.wonkaService = realWonkaService;
        MicrogramLaunchId microgramLaunchId = new MicrogramLaunchId(new RemoteMicrogramApplication("app-withdrawal-intervention", null, 2, null), null);
        microgramLaunchId.setExtensions(MapsKt.mapOf(RealMicrogramDeeplinkService.INSTANCE.getExtension(context, navigator), ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(IncentivesWonkaService.class), realWonkaService)));
        this.launchId = microgramLaunchId;
    }

    private final MicrogramManager2 microgramComponent(CoroutineScope lifecycleScope) {
        return MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(this.microgramManager, lifecycleScope, this.launchId, null, 4, null);
    }

    private final IncentivesWonkaService clientService(CoroutineScope lifecycleScope) {
        return (IncentivesWonkaService) microgramComponent(lifecycleScope).getComponent().getServiceLocator().getClient(IncentivesWonkaService.class);
    }

    public final void enableMicrogramInteractions(CoroutineScope lifecycleScope, TransferInteractionHandler transferInteractionHandler) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(transferInteractionHandler, "transferInteractionHandler");
        this.wonkaService.updateTransferInteractionHandler(transferInteractionHandler);
        clientService(lifecycleScope);
    }

    public final void disableMicrogramInteractions() {
        this.wonkaService.updateTransferInteractionHandler(null);
    }

    public final void markAssetRetentionPromotionSeen(String retentionPeriodKey) {
        Intrinsics.checkNotNullParameter(retentionPeriodKey, "retentionPeriodKey");
        this.assetRetentionPromotionSeenPref.set(retentionPeriodKey, this.clock.instant().getEpochSecond());
    }

    public final boolean eligibleForAssetRetentionPromotion(String retentionPeriodKey, int retentionPeriodSeconds) {
        Intrinsics.checkNotNullParameter(retentionPeriodKey, "retentionPeriodKey");
        return this.clock.instant().getEpochSecond() - this.assetRetentionPromotionSeenPref.get(retentionPeriodKey, 0L) > ((long) retentionPeriodSeconds);
    }
}
