package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore;
import com.robinhood.models.dao.ShouldShowOptionsUpgradeOnSdpDao;
import com.robinhood.models.p320db.ShouldShowOptionsUpgradeOnSdp;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OptionUpgradePromotionStore.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00132\u0006\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0012*\u0004\u0018\u00010\u000fH\u0002R(\u0010\n\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "bonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "shouldShowOptionsUpgradeOnSdpDao", "Lcom/robinhood/models/dao/ShouldShowOptionsUpgradeOnSdpDao;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;Lcom/robinhood/models/dao/ShouldShowOptionsUpgradeOnSdpDao;)V", "getShouldShowOptionsUpgradeOnSdp", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "", "", "Lcom/robinhood/models/db/ShouldShowOptionsUpgradeOnSdp;", "streamShouldShowOptionsUpgradeOnSdp", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore$ShowOptionsUpgradeOnSdp;", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "shouldIncludeNullRiskTolerance", "(Ljava/lang/String;Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "toEnum", "ShowOptionsUpgradeOnSdp", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionUpgradePromotionStore extends Store {
    private final Endpoint<Tuples2<String, Boolean>, ShouldShowOptionsUpgradeOnSdp> getShouldShowOptionsUpgradeOnSdp;
    private final Query<Tuples2<String, Boolean>, ShowOptionsUpgradeOnSdp> streamShouldShowOptionsUpgradeOnSdp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionUpgradePromotionStore(StoreBundle storeBundle, OptionsBonfireApi bonfireApi, final ShouldShowOptionsUpgradeOnSdpDao shouldShowOptionsUpgradeOnSdpDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(shouldShowOptionsUpgradeOnSdpDao, "shouldShowOptionsUpgradeOnSdpDao");
        Endpoint<Tuples2<String, Boolean>, ShouldShowOptionsUpgradeOnSdp> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new OptionUpgradePromotionStore2(bonfireApi, null), getLogoutKillswitch(), new OptionUpgradePromotionStore3(shouldShowOptionsUpgradeOnSdpDao, null), storeBundle.getClock(), null, 16, null);
        this.getShouldShowOptionsUpgradeOnSdp = endpointCreate$default;
        this.streamShouldShowOptionsUpgradeOnSdp = Store.create$default(this, Query.INSTANCE, "streamShouldShowOptionsUpgradeOnSdp", CollectionsKt.listOf(new RefreshEach(new C341581(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionUpgradePromotionStore.streamShouldShowOptionsUpgradeOnSdp$lambda$1(shouldShowOptionsUpgradeOnSdpDao, this, (Tuples2) obj);
            }
        }, false, 8, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionUpgradePromotionStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore$ShowOptionsUpgradeOnSdp;", "", "<init>", "(Ljava/lang/String;I)V", "SERVER_SHOULD_SHOW", "SERVER_SHOULD_NOT_SHOW", "CLIENT_DEFAULT", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowOptionsUpgradeOnSdp {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ShowOptionsUpgradeOnSdp[] $VALUES;
        public static final ShowOptionsUpgradeOnSdp SERVER_SHOULD_SHOW = new ShowOptionsUpgradeOnSdp("SERVER_SHOULD_SHOW", 0);
        public static final ShowOptionsUpgradeOnSdp SERVER_SHOULD_NOT_SHOW = new ShowOptionsUpgradeOnSdp("SERVER_SHOULD_NOT_SHOW", 1);
        public static final ShowOptionsUpgradeOnSdp CLIENT_DEFAULT = new ShowOptionsUpgradeOnSdp("CLIENT_DEFAULT", 2);

        private static final /* synthetic */ ShowOptionsUpgradeOnSdp[] $values() {
            return new ShowOptionsUpgradeOnSdp[]{SERVER_SHOULD_SHOW, SERVER_SHOULD_NOT_SHOW, CLIENT_DEFAULT};
        }

        public static EnumEntries<ShowOptionsUpgradeOnSdp> getEntries() {
            return $ENTRIES;
        }

        private ShowOptionsUpgradeOnSdp(String str, int i) {
        }

        static {
            ShowOptionsUpgradeOnSdp[] showOptionsUpgradeOnSdpArr$values = $values();
            $VALUES = showOptionsUpgradeOnSdpArr$values;
            $ENTRIES = EnumEntries2.enumEntries(showOptionsUpgradeOnSdpArr$values);
        }

        public static ShowOptionsUpgradeOnSdp valueOf(String str) {
            return (ShowOptionsUpgradeOnSdp) Enum.valueOf(ShowOptionsUpgradeOnSdp.class, str);
        }

        public static ShowOptionsUpgradeOnSdp[] values() {
            return (ShowOptionsUpgradeOnSdp[]) $VALUES.clone();
        }
    }

    /* compiled from: OptionUpgradePromotionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore$streamShouldShowOptionsUpgradeOnSdp$1 */
    /* synthetic */ class C341581 extends AdaptedFunctionReference implements Function1<Tuples2<? extends String, ? extends Boolean>, Job> {
        C341581(Object obj) {
            super(1, obj, Endpoint.class, "refresh", "refresh(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Job invoke(Tuples2<? extends String, ? extends Boolean> tuples2) {
            return invoke2((Tuples2<String, Boolean>) tuples2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Job invoke2(Tuples2<String, Boolean> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Endpoint.DefaultImpls.refresh$default((Endpoint) this.receiver, p0, false, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamShouldShowOptionsUpgradeOnSdp$lambda$1(ShouldShowOptionsUpgradeOnSdpDao shouldShowOptionsUpgradeOnSdpDao, final OptionUpgradePromotionStore optionUpgradePromotionStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final Flow<ShouldShowOptionsUpgradeOnSdp> shouldShowOptionsUpgradeOnSdp = shouldShowOptionsUpgradeOnSdpDao.getShouldShowOptionsUpgradeOnSdp((String) tuples2.component1());
        return new Flow<ShowOptionsUpgradeOnSdp>() { // from class: com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore$streamShouldShowOptionsUpgradeOnSdp$lambda$1$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore$streamShouldShowOptionsUpgradeOnSdp$lambda$1$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ OptionUpgradePromotionStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore$streamShouldShowOptionsUpgradeOnSdp$lambda$1$$inlined$map$1$2", m3645f = "OptionUpgradePromotionStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore$streamShouldShowOptionsUpgradeOnSdp$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, OptionUpgradePromotionStore optionUpgradePromotionStore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = optionUpgradePromotionStore;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp showOptionsUpgradeOnSdp = this.this$0.toEnum((ShouldShowOptionsUpgradeOnSdp) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(showOptionsUpgradeOnSdp, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp> flowCollector, Continuation continuation) {
                Object objCollect = shouldShowOptionsUpgradeOnSdp.collect(new AnonymousClass2(flowCollector, optionUpgradePromotionStore), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static /* synthetic */ Flow streamShouldShowOptionsUpgradeOnSdp$default(OptionUpgradePromotionStore optionUpgradePromotionStore, String str, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return optionUpgradePromotionStore.streamShouldShowOptionsUpgradeOnSdp(str, bool);
    }

    public final Flow<ShowOptionsUpgradeOnSdp> streamShouldShowOptionsUpgradeOnSdp(String accountNumber, Boolean shouldIncludeNullRiskTolerance) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.streamShouldShowOptionsUpgradeOnSdp.asFlow(Tuples4.m3642to(accountNumber, shouldIncludeNullRiskTolerance));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShowOptionsUpgradeOnSdp toEnum(ShouldShowOptionsUpgradeOnSdp shouldShowOptionsUpgradeOnSdp) {
        Boolean boolValueOf = shouldShowOptionsUpgradeOnSdp != null ? Boolean.valueOf(shouldShowOptionsUpgradeOnSdp.getShouldShow()) : null;
        if (boolValueOf == null) {
            return ShowOptionsUpgradeOnSdp.CLIENT_DEFAULT;
        }
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE) ? ShowOptionsUpgradeOnSdp.SERVER_SHOULD_SHOW : ShowOptionsUpgradeOnSdp.SERVER_SHOULD_NOT_SHOW;
    }
}
