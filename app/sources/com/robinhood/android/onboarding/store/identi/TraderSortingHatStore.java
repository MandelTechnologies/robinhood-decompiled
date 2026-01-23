package com.robinhood.android.onboarding.store.identi;

import com.robinhood.android.engagement.crypto.impression.HasCryptoImpressionPref;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.experiments.SimpleVariant;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.data.store.identi.SortingHatQueryArgs;
import com.robinhood.models.api.identi.ApiSortingHatResponse;
import com.robinhood.models.api.identi.ApiSortingHatUserState;
import com.robinhood.models.api.sortinghat.AcqReroutingSortingHatExperiment;
import com.robinhood.models.api.sortinghat.SortingHatApi;
import com.robinhood.models.api.sortinghat.SortingHatBonfireApi;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.SortingHatDaoV2;
import com.robinhood.models.dao.identi.SortingHatUserStateDao;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatExperienceMappers;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatRecord;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatUserState;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatUserState2;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.Installation;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: TraderSortingHatStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/onboarding/store/identi/TraderSortingHatStore;", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/models/api/sortinghat/SortingHatApi;", "sortingHatApi", "Lcom/robinhood/models/api/sortinghat/SortingHatBonfireApi;", "sortingHatBonfireApi", "Lcom/robinhood/prefs/Installation;", "installation", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/models/dao/SortingHatDaoV2;", "sortingHatDao", "Lcom/robinhood/models/dao/identi/SortingHatUserStateDao;", "userStateStore", "Lcom/robinhood/prefs/BooleanPreference;", "hasCryptoImpressionPref", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lj$/time/Clock;Lcom/robinhood/models/api/sortinghat/SortingHatApi;Lcom/robinhood/models/api/sortinghat/SortingHatBonfireApi;Lcom/robinhood/prefs/Installation;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/models/dao/SortingHatDaoV2;Lcom/robinhood/models/dao/identi/SortingHatUserStateDao;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatUserState;", "getUserState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;", "args", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;", "getSortingHatRecord", "(Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj$/time/Clock;", "Lcom/robinhood/models/api/sortinghat/SortingHatApi;", "Lcom/robinhood/models/api/sortinghat/SortingHatBonfireApi;", "Lcom/robinhood/prefs/Installation;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "lib-store-identi-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TraderSortingHatStore extends BaseSortingHatStore {
    private final Clock clock;
    private final ExperimentsStore experimentsStore;
    private final Installation installation;
    private final SortingHatApi sortingHatApi;
    private final SortingHatBonfireApi sortingHatBonfireApi;

    /* compiled from: TraderSortingHatStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.store.identi.TraderSortingHatStore", m3645f = "TraderSortingHatStore.kt", m3646l = {54, 56, 63}, m3647m = "getSortingHatRecord")
    /* renamed from: com.robinhood.android.onboarding.store.identi.TraderSortingHatStore$getSortingHatRecord$1 */
    /* loaded from: classes10.dex */
    static final class C227921 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C227921(Continuation<? super C227921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TraderSortingHatStore.this.getSortingHatRecord(null, this);
        }
    }

    /* compiled from: TraderSortingHatStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.store.identi.TraderSortingHatStore", m3645f = "TraderSortingHatStore.kt", m3646l = {44}, m3647m = "getUserState")
    /* renamed from: com.robinhood.android.onboarding.store.identi.TraderSortingHatStore$getUserState$1 */
    /* loaded from: classes10.dex */
    static final class C227931 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C227931(Continuation<? super C227931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TraderSortingHatStore.this.getUserState(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraderSortingHatStore(Clock clock, SortingHatApi sortingHatApi, SortingHatBonfireApi sortingHatBonfireApi, Installation installation, ExperimentsStore experimentsStore, SortingHatDaoV2 sortingHatDao, SortingHatUserStateDao userStateStore, @HasCryptoImpressionPref BooleanPreference hasCryptoImpressionPref, StoreBundle storeBundle) {
        super(sortingHatDao, userStateStore, hasCryptoImpressionPref, storeBundle);
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(sortingHatApi, "sortingHatApi");
        Intrinsics.checkNotNullParameter(sortingHatBonfireApi, "sortingHatBonfireApi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(sortingHatDao, "sortingHatDao");
        Intrinsics.checkNotNullParameter(userStateStore, "userStateStore");
        Intrinsics.checkNotNullParameter(hasCryptoImpressionPref, "hasCryptoImpressionPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.clock = clock;
        this.sortingHatApi = sortingHatApi;
        this.sortingHatBonfireApi = sortingHatBonfireApi;
        this.installation = installation;
        this.experimentsStore = experimentsStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUserState(Continuation<? super SortingHatUserState> continuation) {
        C227931 c227931;
        if (continuation instanceof C227931) {
            c227931 = (C227931) continuation;
            int i = c227931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c227931.label = i - Integer.MIN_VALUE;
            } else {
                c227931 = new C227931(continuation);
            }
        }
        Object sortingHatUserState = c227931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c227931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(sortingHatUserState);
            SortingHatApi sortingHatApi = this.sortingHatApi;
            c227931.label = 1;
            sortingHatUserState = sortingHatApi.getSortingHatUserState(null, c227931);
            if (sortingHatUserState == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(sortingHatUserState);
        }
        return SortingHatUserState2.toDbModel((ApiSortingHatUserState) sortingHatUserState);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r15 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (r15 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getSortingHatRecord(SortingHatQueryArgs sortingHatQueryArgs, Continuation<? super SortingHatRecord> continuation) {
        C227921 c227921;
        ApiSortingHatResponse apiSortingHatResponse;
        if (continuation instanceof C227921) {
            c227921 = (C227921) continuation;
            int i = c227921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c227921.label = i - Integer.MIN_VALUE;
            } else {
                c227921 = new C227921(continuation);
            }
        }
        C227921 c2279212 = c227921;
        Object objFirst = c2279212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2279212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow flowCoStreamVariant$default = ExperimentsProvider.DefaultImpls.coStreamVariant$default(this.experimentsStore, AcqReroutingSortingHatExperiment.INSTANCE, SimpleVariant.CONTROL, false, 4, null);
            c2279212.L$0 = sortingHatQueryArgs;
            c2279212.label = 1;
            objFirst = FlowKt.first(flowCoStreamVariant$default, c2279212);
            if (objFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                sortingHatQueryArgs = (SortingHatQueryArgs) c2279212.L$0;
                ResultKt.throwOnFailure(objFirst);
                apiSortingHatResponse = (ApiSortingHatResponse) objFirst;
                String applicationId = sortingHatQueryArgs.getApplicationId();
                String accountNumber = sortingHatQueryArgs.getAccountNumber();
                boolean hasCryptoImpression = sortingHatQueryArgs.getHasCryptoImpression();
                Instant instant = this.clock.instant();
                Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
                return SortingHatExperienceMappers.toRecord(apiSortingHatResponse, applicationId, accountNumber, hasCryptoImpression, instant);
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sortingHatQueryArgs = (SortingHatQueryArgs) c2279212.L$0;
            ResultKt.throwOnFailure(objFirst);
            apiSortingHatResponse = (ApiSortingHatResponse) objFirst;
            String applicationId2 = sortingHatQueryArgs.getApplicationId();
            String accountNumber2 = sortingHatQueryArgs.getAccountNumber();
            boolean hasCryptoImpression2 = sortingHatQueryArgs.getHasCryptoImpression();
            Instant instant2 = this.clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant2, "instant(...)");
            return SortingHatExperienceMappers.toRecord(apiSortingHatResponse, applicationId2, accountNumber2, hasCryptoImpression2, instant2);
        }
        sortingHatQueryArgs = (SortingHatQueryArgs) c2279212.L$0;
        ResultKt.throwOnFailure(objFirst);
        if (((SimpleVariant) objFirst) == SimpleVariant.MEMBER) {
            SortingHatBonfireApi sortingHatBonfireApi = this.sortingHatBonfireApi;
            String applicationId3 = sortingHatQueryArgs.getApplicationId();
            String accountNumber3 = sortingHatQueryArgs.getAccountNumber();
            boolean hasCryptoImpression3 = sortingHatQueryArgs.getHasCryptoImpression();
            String strMo2745id = this.installation.mo2745id();
            c2279212.L$0 = sortingHatQueryArgs;
            c2279212.label = 2;
            objFirst = sortingHatBonfireApi.getSortingHatExperience(applicationId3, accountNumber3, hasCryptoImpression3, strMo2745id, c2279212);
        } else {
            SortingHatApi sortingHatApi = this.sortingHatApi;
            String applicationId4 = sortingHatQueryArgs.getApplicationId();
            String accountNumber4 = sortingHatQueryArgs.getAccountNumber();
            boolean hasCryptoImpression4 = sortingHatQueryArgs.getHasCryptoImpression();
            String strMo2745id2 = this.installation.mo2745id();
            c2279212.L$0 = sortingHatQueryArgs;
            c2279212.label = 3;
            objFirst = sortingHatApi.getSortingHatExperience(applicationId4, accountNumber4, hasCryptoImpression4, strMo2745id2, c2279212);
        }
        return coroutine_suspended;
    }
}
