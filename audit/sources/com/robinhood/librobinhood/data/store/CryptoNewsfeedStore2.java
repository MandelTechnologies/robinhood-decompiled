package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.crypto.p033v1.ContentDto;
import bonfire.proto.idl.crypto.p033v1.CryptoService;
import bonfire.proto.idl.crypto.p033v1.DataDto;
import bonfire.proto.idl.crypto.p033v1.NewsfeedRequestDto;
import bonfire.proto.idl.crypto.p033v1.NewsfeedResponseDto;
import com.robinhood.models.crypto.p314db.CryptoNewsfeed;
import com.robinhood.utils.extensions.StringsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoNewsfeedStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/crypto/db/CryptoNewsfeed;", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoNewsfeedStore$cryptoNewsfeedEndpoint$1", m3645f = "CryptoNewsfeedStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptoNewsfeedStore$cryptoNewsfeedEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoNewsfeedStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super List<? extends CryptoNewsfeed>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoNewsfeedStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoNewsfeedStore2(CryptoNewsfeedStore cryptoNewsfeedStore, Continuation<? super CryptoNewsfeedStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoNewsfeedStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoNewsfeedStore2 cryptoNewsfeedStore2 = new CryptoNewsfeedStore2(this.this$0, continuation);
        cryptoNewsfeedStore2.L$0 = obj;
        return cryptoNewsfeedStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(UUID uuid, Continuation<? super List<? extends CryptoNewsfeed>> continuation) {
        return invoke2(uuid, (Continuation<? super List<CryptoNewsfeed>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(UUID uuid, Continuation<? super List<CryptoNewsfeed>> continuation) {
        return ((CryptoNewsfeedStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            CryptoService cryptoService = this.this$0.cryptoService;
            String string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            NewsfeedRequestDto newsfeedRequestDto = new NewsfeedRequestDto(string2);
            this.label = 1;
            obj = cryptoService.Newsfeed(newsfeedRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List<ContentDto> results = ((NewsfeedResponseDto) obj).getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        for (ContentDto contentDto : results) {
            UUID uuid2 = StringsKt.toUuid(contentDto.getId());
            UUID uuid3 = StringsKt.toUuid(contentDto.getCurrency_id());
            DataDto data = contentDto.getData();
            if (data == null) {
                throw new IllegalStateException("Required value was null.");
            }
            DataDto data2 = contentDto.getData();
            if (data2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(new CryptoNewsfeed(uuid2, uuid3, StringsKt.safeToInstant(data2.getPublished_at()), data));
        }
        return arrayList;
    }
}
