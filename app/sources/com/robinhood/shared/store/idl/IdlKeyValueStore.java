package com.robinhood.shared.store.idl;

import com.robinhood.idl.Dto;
import com.robinhood.idl.Dto3;
import com.robinhood.shared.models.idl.dao.IdlCacheDao;
import com.robinhood.shared.models.idl.p389db.IdlCacheEntry;
import com.robinhood.shared.models.idl.p390ui.UiIdlCacheEntry;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Instant;

/* compiled from: IdlKeyValueStore.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B@\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012%\u0010\f\u001a!\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0002\b\n0\u0006j\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0016\u001a\u00020\u0015\"\f\b\u0000\u0010\u0010*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b0\u001a\"\f\b\u0000\u0010\u0010*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR3\u0010\f\u001a!\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0002\b\n0\u0006j\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/store/idl/IdlKeyValueStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/shared/models/idl/dao/IdlCacheDao;", "idlCacheDao", "", "", "Lkotlin/Function0;", "Lcom/squareup/wire/ProtoAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "protoAdapterSupplierMap", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/shared/models/idl/dao/IdlCacheDao;Ljava/util/Map;)V", "Lcom/robinhood/idl/MessageDto;", "T", "key", WebsocketGatewayConstants.DATA_KEY, "j$/time/Instant", "timestamp", "", "insert", "(Ljava/lang/String;Lcom/robinhood/idl/MessageDto;Lj$/time/Instant;)V", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/shared/models/idl/ui/UiIdlCacheEntry;", "stream", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/shared/models/idl/dao/IdlCacheDao;", "Ljava/util/Map;", "lib-store-idl_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class IdlKeyValueStore extends Store {
    private final IdlCacheDao idlCacheDao;
    private final Map<String, Function0<ProtoAdapter<?>>> protoAdapterSupplierMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdlKeyValueStore(StoreBundle storeBundle, IdlCacheDao idlCacheDao, Map<String, Function0<ProtoAdapter<?>>> protoAdapterSupplierMap) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(idlCacheDao, "idlCacheDao");
        Intrinsics.checkNotNullParameter(protoAdapterSupplierMap, "protoAdapterSupplierMap");
        this.idlCacheDao = idlCacheDao;
        this.protoAdapterSupplierMap = protoAdapterSupplierMap;
    }

    public static /* synthetic */ void insert$default(IdlKeyValueStore idlKeyValueStore, String str, Dto3 dto3, Instant instant, int i, Object obj) {
        if ((i & 4) != 0) {
            instant = Instant.now();
        }
        idlKeyValueStore.insert(str, dto3, instant);
    }

    public final <T extends Dto3<?>> void insert(String key, T data, Instant timestamp) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        String typeUrl = ((Message) data.toProto()).adapter().getTypeUrl();
        if (typeUrl == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.idlCacheDao.insert(new IdlCacheEntry(key, typeUrl, ((Message) data.toProto()).encode(), timestamp));
    }

    public final <T extends Dto3<?>> Flow<UiIdlCacheEntry<T>> stream(String key, KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Object obj = JvmClassMapping.getJavaClass(kClass).getDeclaredField("Companion").get(null);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.robinhood.idl.Dto.Creator<kotlin.Any, kotlin.Any>");
        final Dto.Creator creator = (Dto.Creator) obj;
        String typeUrl = creator.getProtoAdapter().getTypeUrl();
        Function0<ProtoAdapter<?>> function0 = this.protoAdapterSupplierMap.get(typeUrl);
        final ProtoAdapter<?> protoAdapterInvoke = function0 != null ? function0.invoke() : null;
        if (protoAdapterInvoke == null) {
            throw new IllegalStateException(("No proto adapter found for " + typeUrl).toString());
        }
        IdlCacheDao idlCacheDao = this.idlCacheDao;
        String typeUrl2 = protoAdapterInvoke.getTypeUrl();
        if (typeUrl2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        final Flow<IdlCacheEntry> flow = idlCacheDao.get(key, typeUrl2);
        return (Flow<UiIdlCacheEntry<T>>) new Flow<UiIdlCacheEntry<T>>() { // from class: com.robinhood.shared.store.idl.IdlKeyValueStore$stream$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.store.idl.IdlKeyValueStore$stream$$inlined$map$1$2 */
            public static final class C399522<T> implements FlowCollector {
                final /* synthetic */ Dto.Creator $companion$inlined;
                final /* synthetic */ ProtoAdapter $protoAdapter$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.store.idl.IdlKeyValueStore$stream$$inlined$map$1$2", m3645f = "IdlKeyValueStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.store.idl.IdlKeyValueStore$stream$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C399522.this.emit(null, this);
                    }
                }

                public C399522(FlowCollector flowCollector, ProtoAdapter protoAdapter, Dto.Creator creator) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$protoAdapter$inlined = protoAdapter;
                    this.$companion$inlined = creator;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    byte[] data;
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
                        IdlCacheEntry idlCacheEntry = (IdlCacheEntry) obj;
                        UiIdlCacheEntry uiIdlCacheEntry = (idlCacheEntry == null || (data = idlCacheEntry.getData()) == null) ? null : new UiIdlCacheEntry(this.$companion$inlined.fromProto(this.$protoAdapter$inlined.decode(data)), idlCacheEntry.getTimestamp());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(uiIdlCacheEntry, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C399522(flowCollector, protoAdapterInvoke, creator), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
