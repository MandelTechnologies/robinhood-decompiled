package com.robinhood.lib.equity.instrument;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: InstrumentService.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/lib/equity/instrument/InstrumentService;", "", "getInstrument", "Lkotlin/Result;", "Lcom/robinhood/lib/equity/instrument/Instrument;", "id", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "getInstrument-gIAlu-s", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public interface InstrumentService {
    /* renamed from: getInstrument-gIAlu-s, reason: not valid java name */
    Object mo22534getInstrumentgIAlus(UUID uuid, Continuation<? super Result<Instrument>> continuation);
}
