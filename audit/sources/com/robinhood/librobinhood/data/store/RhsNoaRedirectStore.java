package com.robinhood.librobinhood.data.store;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.HasDismissedT60RhsNoaRedirectPref;
import com.robinhood.librobinhood.data.prefs.HasShownT30RhsNoaRedirectSheetPref;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p355ui.bonfire.rhy.RhsNoaRedirectStatus;
import com.robinhood.prefs.LongPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.LocalDates4;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.threeten.extra.Days;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: RhsNoaRedirectStore.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\f\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\b\u0012\u0004\u0012\u00020\u00160\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00150\u0011H\u0002¢\u0006\u0004\b!\u0010\u0018J\u001b\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00150\u0011H\u0002¢\u0006\u0004\b\"\u0010\u0018J;\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b+\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/¨\u00061"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhsNoaRedirectStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/prefs/LongPreference;", "hasDismissedT60RhsNoaRedirectPref", "hasShownT30RhsNoaRedirectSheetPref", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;", "promptIfMember", "Lio/reactivex/Observable;", "Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus;", "shouldPromptRedirect", "(Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;)Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "latestUsedDirectDepositRelationship", "()Lio/reactivex/Observable;", "Lcom/robinhood/models/entity/RhEntity;", "entity", "getLatestUsedDdRelationship", "(Lcom/robinhood/models/entity/RhEntity;)Lio/reactivex/Observable;", "", "latestUsed", "(Ljava/util/List;)Lcom/robinhood/utils/Optional;", "", "transferIdOfPaycheckWhenDismissed", "transferIdOfPaycheckWhenSheetPrompted", "j$/time/Instant", "redirectExpireAt", "latestRhsDdRelationshipDateWhenBannerDismissed", "j$/time/LocalDate", "latestRhsDdRelationshipDate", "latestRhsDdRelationshipDateWhenShownSheet", "determineStatus", "(Lj$/time/Instant;Ljava/lang/Long;Lj$/time/LocalDate;Ljava/lang/Long;)Lio/reactivex/Observable;", "stream", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/prefs/LongPreference;", "Companion", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class RhsNoaRedirectStore extends Store {
    private static final int DAYS_AFTER_RHY_CREATION_DD_REDIRECTS_STOP = 180;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final ExperimentsStore experimentsStore;
    private final LongPreference hasDismissedT60RhsNoaRedirectPref;
    private final LongPreference hasShownT30RhsNoaRedirectSheetPref;
    private final RhyAccountStore rhyAccountStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhsNoaRedirectStore(DirectDepositRelationshipStore directDepositRelationshipStore, RhyAccountStore rhyAccountStore, ExperimentsStore experimentsStore, @HasDismissedT60RhsNoaRedirectPref LongPreference hasDismissedT60RhsNoaRedirectPref, @HasShownT30RhsNoaRedirectSheetPref LongPreference hasShownT30RhsNoaRedirectSheetPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(hasDismissedT60RhsNoaRedirectPref, "hasDismissedT60RhsNoaRedirectPref");
        Intrinsics.checkNotNullParameter(hasShownT30RhsNoaRedirectSheetPref, "hasShownT30RhsNoaRedirectSheetPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.rhyAccountStore = rhyAccountStore;
        this.experimentsStore = experimentsStore;
        this.hasDismissedT60RhsNoaRedirectPref = hasDismissedT60RhsNoaRedirectPref;
        this.hasShownT30RhsNoaRedirectSheetPref = hasShownT30RhsNoaRedirectSheetPref;
    }

    public final Observable<RhsNoaRedirectStatus> stream() {
        Observable<RhsNoaRedirectStatus> observableSwitchMap = Observables.INSTANCE.combineLatest(latestUsedDirectDepositRelationship(), transferIdOfPaycheckWhenDismissed(), transferIdOfPaycheckWhenSheetPrompted()).switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.RhsNoaRedirectStore.stream.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends RhsNoaRedirectStatus> apply(Tuples3<? extends Optional<DirectDepositRelationship>, ? extends Optional<Long>, ? extends Optional<Long>> tuples3) {
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                Optional<DirectDepositRelationship> optionalComponent1 = tuples3.component1();
                Optional<Long> optionalComponent2 = tuples3.component2();
                Optional<Long> optionalComponent3 = tuples3.component3();
                DirectDepositRelationship orNull = optionalComponent1.getOrNull();
                final Long orNull2 = optionalComponent2.getOrNull();
                final Long orNull3 = optionalComponent3.getOrNull();
                final LocalDate latestDdDate = orNull != null ? orNull.getLatestDdDate() : null;
                if ((orNull != null ? orNull.getEntityType() : null) == RhEntity.RHS && latestDdDate != null) {
                    Observable<Optional<RhyAccount>> observableStreamSpendingAccount = RhsNoaRedirectStore.this.rhyAccountStore.streamSpendingAccount();
                    final RhsNoaRedirectStore rhsNoaRedirectStore = RhsNoaRedirectStore.this;
                    return observableStreamSpendingAccount.switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.RhsNoaRedirectStore.stream.1.1
                        @Override // io.reactivex.functions.Function
                        public final ObservableSource<? extends RhsNoaRedirectStatus> apply(Optional<RhyAccount> optional) {
                            Intrinsics.checkNotNullParameter(optional, "<destruct>");
                            RhyAccount rhyAccountComponent1 = optional.component1();
                            Instant instantPlus = null;
                            Instant createdAt = rhyAccountComponent1 != null ? rhyAccountComponent1.getCreatedAt() : null;
                            if (createdAt != null) {
                                instantPlus = createdAt.plus((TemporalAmount) Days.m3991of(180));
                                Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
                            }
                            return rhsNoaRedirectStore.determineStatus(instantPlus, orNull2, latestDdDate, orNull3);
                        }
                    });
                }
                return Observable.just(RhsNoaRedirectStatus.NoRedirectNeeded.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    private final Observable<RhsNoaRedirectStatus> shouldPromptRedirect(final RhsNoaRedirectStatus.PromptRedirect promptIfMember) {
        Observable<RhsNoaRedirectStatus> map = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiment.NOA_REDIRECT_MESSAGING.INSTANCE}, false, null, 6, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.RhsNoaRedirectStore.shouldPromptRedirect.1
            @Override // io.reactivex.functions.Function
            public final RhsNoaRedirectStatus apply(Boolean member) {
                Intrinsics.checkNotNullParameter(member, "member");
                if (member.booleanValue()) {
                    return promptIfMember;
                }
                return RhsNoaRedirectStatus.NoRedirectNeeded.INSTANCE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    private final Observable<Optional<DirectDepositRelationship>> latestUsedDirectDepositRelationship() {
        Observable<Optional<DirectDepositRelationship>> map = Observables.INSTANCE.zip(getLatestUsedDdRelationship(RhEntity.RHY), getLatestUsedDdRelationship(RhEntity.RHS)).map(new Function() { // from class: com.robinhood.librobinhood.data.store.RhsNoaRedirectStore.latestUsedDirectDepositRelationship.1
            @Override // io.reactivex.functions.Function
            public final Optional<DirectDepositRelationship> apply(Tuples2<? extends Optional<DirectDepositRelationship>, ? extends Optional<DirectDepositRelationship>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return RhsNoaRedirectStore.this.latestUsed(CollectionsKt.listOfNotNull((Object[]) new DirectDepositRelationship[]{tuples2.component1().getOrNull(), tuples2.component2().getOrNull()}));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    private final Observable<Optional<DirectDepositRelationship>> getLatestUsedDdRelationship(RhEntity entity) {
        Observable map = this.directDepositRelationshipStore.getDirectDepositRelationships(entity).map(new Function() { // from class: com.robinhood.librobinhood.data.store.RhsNoaRedirectStore.getLatestUsedDdRelationship.1
            @Override // io.reactivex.functions.Function
            public final Optional<DirectDepositRelationship> apply(List<DirectDepositRelationship> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return RhsNoaRedirectStore.this.latestUsed(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Optional<DirectDepositRelationship> latestUsed(List<DirectDepositRelationship> list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((DirectDepositRelationship) obj2).getLatestDdDate() != null) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                LocalDate latestDdDate = ((DirectDepositRelationship) next).getLatestDdDate();
                if (latestDdDate == null) {
                    latestDdDate = LocalDate.MIN;
                }
                do {
                    Object next2 = it.next();
                    LocalDate latestDdDate2 = ((DirectDepositRelationship) next2).getLatestDdDate();
                    if (latestDdDate2 == null) {
                        latestDdDate2 = LocalDate.MIN;
                    }
                    if (latestDdDate.compareTo(latestDdDate2) < 0) {
                        next = next2;
                        latestDdDate = latestDdDate2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return Optional3.asOptional(obj);
    }

    private final Observable<Optional<Long>> transferIdOfPaycheckWhenDismissed() {
        Observable<Optional<Long>> observableDistinctUntilChanged = this.hasDismissedT60RhsNoaRedirectPref.changes().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    private final Observable<Optional<Long>> transferIdOfPaycheckWhenSheetPrompted() {
        Observable<Optional<Long>> observableDistinctUntilChanged = this.hasShownT30RhsNoaRedirectSheetPref.changes().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Observable<RhsNoaRedirectStatus> determineStatus(Instant redirectExpireAt, Long latestRhsDdRelationshipDateWhenBannerDismissed, LocalDate latestRhsDdRelationshipDate, Long latestRhsDdRelationshipDateWhenShownSheet) {
        Instant instantNow = Instant.now();
        if (redirectExpireAt == null) {
            Observable<RhsNoaRedirectStatus> observableJust = Observable.just(RhsNoaRedirectStatus.NoRedirectNeeded.INSTANCE);
            Intrinsics.checkNotNull(observableJust);
            return observableJust;
        }
        Intrinsics.checkNotNull(instantNow);
        Instant instantPlus = instantNow.plus((TemporalAmount) Days.m3991of(60));
        Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
        if (instantPlus.isBefore(redirectExpireAt)) {
            Observable<RhsNoaRedirectStatus> observableJust2 = Observable.just(RhsNoaRedirectStatus.NoRedirectNeeded.INSTANCE);
            Intrinsics.checkNotNull(observableJust2);
            return observableJust2;
        }
        boolean z = true;
        long epochMillis$default = LocalDates4.toEpochMillis$default(latestRhsDdRelationshipDate, null, 1, null);
        if (latestRhsDdRelationshipDateWhenBannerDismissed != null && latestRhsDdRelationshipDateWhenBannerDismissed.longValue() == epochMillis$default) {
            Instant instantPlus2 = instantNow.plus((TemporalAmount) Days.m3991of(30));
            Intrinsics.checkNotNullExpressionValue(instantPlus2, "plus(...)");
            if (instantPlus2.isBefore(redirectExpireAt)) {
                Observable<RhsNoaRedirectStatus> observableJust3 = Observable.just(RhsNoaRedirectStatus.NoRedirectNeeded.INSTANCE);
                Intrinsics.checkNotNull(observableJust3);
                return observableJust3;
            }
        }
        long epochMillis$default2 = LocalDates4.toEpochMillis$default(latestRhsDdRelationshipDate, null, 1, null);
        if (latestRhsDdRelationshipDateWhenShownSheet != null && latestRhsDdRelationshipDateWhenShownSheet.longValue() == epochMillis$default2) {
            z = false;
        } else {
            Instant instantPlus3 = instantNow.plus((TemporalAmount) Days.m3991of(30));
            Intrinsics.checkNotNullExpressionValue(instantPlus3, "plus(...)");
            if (!instantPlus3.isAfter(redirectExpireAt)) {
            }
        }
        return shouldPromptRedirect(new RhsNoaRedirectStatus.PromptRedirect(redirectExpireAt, z, latestRhsDdRelationshipDate));
    }
}
