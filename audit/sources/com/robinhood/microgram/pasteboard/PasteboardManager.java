package com.robinhood.microgram.pasteboard;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: PasteboardManager.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/microgram/pasteboard/MicrogramPasteboardManager;", "", "getText", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setText", "", "value", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "mg.ui.pasteboard")
/* renamed from: com.robinhood.microgram.pasteboard.MicrogramPasteboardManager, reason: use source file name */
/* loaded from: classes13.dex */
public interface PasteboardManager {
    Object getText(Continuation<? super String> continuation);

    Object setText(String str, Continuation<? super Unit> continuation);
}
