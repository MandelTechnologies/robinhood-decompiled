package com.robinhood.librobinhood.logging;

import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: RhyGlobalLoggingContext.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001%B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bJ.\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000bJ*\u0010 \u001a\u00020!2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\"\u001a\u00020\u0015J\b\u0010#\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "", "rhyAccountLoggingStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "<init>", "(Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/utils/LogoutKillswitch;)V", "lastKnownEntryPoint", "", "hasDirectDepositRelationships", "", "hasDirectDepositRelationshipsJob", "Lkotlinx/coroutines/Job;", "loggingHasDirectDepositRelationships", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "getLoggingHasDirectDepositRelationships", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "setEntryPoint", "", "entryPoint", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext$EntryPoint;", "setRawEntryPoint", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "productArea", "Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "productTag", "overrideEntryPoint", "rhyContext", "Lcom/robinhood/rosetta/eventlogging/RHYContext;", "refresh", "refreshAccountInfo", "refreshHasDirectDepositRelationships", "EntryPoint", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyGlobalLoggingContext {
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private boolean hasDirectDepositRelationships;
    private Job hasDirectDepositRelationshipsJob;
    private String lastKnownEntryPoint;
    private final LogoutKillswitch logoutKillswitch;
    private final RhyAccountLoggingStore rhyAccountLoggingStore;

    public RhyGlobalLoggingContext(RhyAccountLoggingStore rhyAccountLoggingStore, DirectDepositRelationshipStore directDepositRelationshipStore, LogoutKillswitch logoutKillswitch) {
        Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        this.rhyAccountLoggingStore = rhyAccountLoggingStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.logoutKillswitch = logoutKillswitch;
    }

    private final Boolean getLoggingHasDirectDepositRelationships() {
        if (this.hasDirectDepositRelationships) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public final void setEntryPoint(EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.lastKnownEntryPoint = entryPoint.getIdentifier();
    }

    public final void setRawEntryPoint(String entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.lastKnownEntryPoint = entryPoint;
    }

    public static /* synthetic */ Context eventContext$default(RhyGlobalLoggingContext rhyGlobalLoggingContext, RHYContext.ProductArea productArea, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            productArea = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return rhyGlobalLoggingContext.eventContext(productArea, str, str2);
    }

    public final Context eventContext(RHYContext.ProductArea productArea, String productTag, String overrideEntryPoint) {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, rhyContext(productArea, productTag, overrideEntryPoint), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2049, -1, -1, -1, 16383, null);
    }

    public static /* synthetic */ RHYContext rhyContext$default(RhyGlobalLoggingContext rhyGlobalLoggingContext, RHYContext.ProductArea productArea, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            productArea = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return rhyGlobalLoggingContext.rhyContext(productArea, str, str2);
    }

    public final RHYContext rhyContext(RHYContext.ProductArea productArea, String productTag, String overrideEntryPoint) {
        if (productArea == null) {
            productArea = RHYContext.ProductArea.PRODUCT_AREA_UNSPECIFIED;
        }
        return new RHYContext(productArea, productTag == null ? "" : productTag, ((overrideEntryPoint == null || StringsKt.isBlank(overrideEntryPoint)) && (overrideEntryPoint = this.lastKnownEntryPoint) == null) ? "" : overrideEntryPoint, this.rhyAccountLoggingStore.getRhyAccountType(), getLoggingHasDirectDepositRelationships(), null, 32, null);
    }

    public final void refresh() {
        refreshAccountInfo();
        refreshHasDirectDepositRelationships();
    }

    private final void refreshAccountInfo() {
        this.rhyAccountLoggingStore.refresh(true);
    }

    /* compiled from: RhyGlobalLoggingContext.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.logging.RhyGlobalLoggingContext$refreshHasDirectDepositRelationships$1", m3645f = "RhyGlobalLoggingContext.kt", m3646l = {102}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.logging.RhyGlobalLoggingContext$refreshHasDirectDepositRelationships$1 */
    static final class C348981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C348981(Continuation<? super C348981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyGlobalLoggingContext.this.new C348981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            RhyGlobalLoggingContext rhyGlobalLoggingContext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RhyGlobalLoggingContext rhyGlobalLoggingContext2 = RhyGlobalLoggingContext.this;
                Single singleForceFetchHasDirectDepositRelationshipsIfNotCached$default = DirectDepositRelationshipStore.forceFetchHasDirectDepositRelationshipsIfNotCached$default(rhyGlobalLoggingContext2.directDepositRelationshipStore, RhEntity.RHY, null, 2, null);
                this.L$0 = rhyGlobalLoggingContext2;
                this.label = 1;
                Object objAwait = RxAwait3.await(singleForceFetchHasDirectDepositRelationshipsIfNotCached$default, this);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                rhyGlobalLoggingContext = rhyGlobalLoggingContext2;
                obj = objAwait;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rhyGlobalLoggingContext = (RhyGlobalLoggingContext) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
            rhyGlobalLoggingContext.hasDirectDepositRelationships = ((Boolean) obj).booleanValue();
            return Unit.INSTANCE;
        }
    }

    private final void refreshHasDirectDepositRelationships() {
        Job job = this.hasDirectDepositRelationshipsJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.hasDirectDepositRelationshipsJob = BuildersKt__Builders_commonKt.launch$default(this.logoutKillswitch.getLoggedInScope(), null, null, new C348981(null), 3, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RhyGlobalLoggingContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext$EntryPoint;", "", "identifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "ONBOARDING", "EXISTING_USER_CASH_TAB", "CM_SUNSET_ONBOARDING", "CARD_DECLINE_UPSELL", "SPENDING_SETTINGS", "CARD_CONTROLS", "DEEP_LINK", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;
        private final String identifier;
        public static final EntryPoint ONBOARDING = new EntryPoint("ONBOARDING", 0, "new_rhy_onboarding");
        public static final EntryPoint EXISTING_USER_CASH_TAB = new EntryPoint("EXISTING_USER_CASH_TAB", 1, "existing_rhy_half_sheet");
        public static final EntryPoint CM_SUNSET_ONBOARDING = new EntryPoint("CM_SUNSET_ONBOARDING", 2, "cm_sunset_onboarding");
        public static final EntryPoint CARD_DECLINE_UPSELL = new EntryPoint("CARD_DECLINE_UPSELL", 3, "decline_upsell");
        public static final EntryPoint SPENDING_SETTINGS = new EntryPoint("SPENDING_SETTINGS", 4, "spending_settings");
        public static final EntryPoint CARD_CONTROLS = new EntryPoint("CARD_CONTROLS", 5, "card_controls");
        public static final EntryPoint DEEP_LINK = new EntryPoint("DEEP_LINK", 6, "deep_link");

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ONBOARDING, EXISTING_USER_CASH_TAB, CM_SUNSET_ONBOARDING, CARD_DECLINE_UPSELL, SPENDING_SETTINGS, CARD_CONTROLS, DEEP_LINK};
        }

        public static EnumEntries<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        private EntryPoint(String str, int i, String str2) {
            this.identifier = str2;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        static {
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }
}
