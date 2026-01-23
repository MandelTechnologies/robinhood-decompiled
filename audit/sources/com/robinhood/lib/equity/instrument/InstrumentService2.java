package com.robinhood.lib.equity.instrument;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import microgram.datasource.DataSourceRequestContext;

/* compiled from: InstrumentService.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/lib/equity/instrument/InstrumentServiceImplementation;", "Lcom/robinhood/lib/equity/instrument/InstrumentService;", "context", "Lmicrogram/datasource/DataSourceRequestContext;", "json", "Lkotlinx/serialization/json/Json;", "(Lmicrogram/datasource/DataSourceRequestContext;Lkotlinx/serialization/json/Json;)V", "getInstrument", "Lkotlin/Result;", "Lcom/robinhood/lib/equity/instrument/Instrument;", "id", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "getInstrument-gIAlu-s", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Component", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.lib.equity.instrument.InstrumentServiceImplementation, reason: use source file name */
/* loaded from: classes27.dex */
public final class InstrumentService2 implements InstrumentService {
    private final DataSourceRequestContext context;
    private final Json json;

    /* compiled from: InstrumentService.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/lib/equity/instrument/InstrumentServiceImplementation$Component;", "", "bind", "Lcom/robinhood/lib/equity/instrument/InstrumentService;", "Lcom/robinhood/lib/equity/instrument/InstrumentServiceImplementation;", "getBind", "(Lcom/robinhood/lib/equity/instrument/InstrumentServiceImplementation;)Lcom/robinhood/lib/equity/instrument/InstrumentService;", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.lib.equity.instrument.InstrumentServiceImplementation$Component */
    public interface Component {

        /* compiled from: InstrumentService.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.lib.equity.instrument.InstrumentServiceImplementation$Component$DefaultImpls */
        public static final class DefaultImpls {
            public static InstrumentService getBind(Component component, InstrumentService2 receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                return receiver;
            }
        }

        InstrumentService getBind(InstrumentService2 instrumentService2);
    }

    public InstrumentService2(DataSourceRequestContext context, Json json) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(json, "json");
        this.json = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.lib.equity.instrument.InstrumentService
    /* renamed from: getInstrument-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo22534getInstrumentgIAlus(UUID uuid, Continuation<? super Result<Instrument>> continuation) {
        InstrumentService3 instrumentService3;
        if (continuation instanceof InstrumentService3) {
            instrumentService3 = (InstrumentService3) continuation;
            int i = instrumentService3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instrumentService3.label = i - Integer.MIN_VALUE;
            } else {
                instrumentService3 = new InstrumentService3(this, continuation);
            }
        }
        Object obj = instrumentService3.result;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = instrumentService3.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((Result) obj).getValue();
    }
}
