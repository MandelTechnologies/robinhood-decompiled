package com.robinhood.iac.extensions;

import com.robinhood.models.p320db.IacStatusBanner;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.InAppComm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacStatusBanners.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0019\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"component", "Lcom/robinhood/rosetta/eventlogging/Component;", "Lcom/robinhood/models/db/IacStatusBanner;", "getComponent", "(Lcom/robinhood/models/db/IacStatusBanner;)Lcom/robinhood/rosetta/eventlogging/Component;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "(Lcom/robinhood/models/db/IacStatusBanner;)Lcom/robinhood/rosetta/eventlogging/Context;", "lib-iac-status-banner_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.iac.extensions.IacStatusBannersKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class IacStatusBanners {
    public static final Component getComponent(IacStatusBanner iacStatusBanner) {
        Intrinsics.checkNotNullParameter(iacStatusBanner, "<this>");
        Component.ComponentType componentType = Component.ComponentType.STATUS_BANNER;
        String loggingIdentifier = iacStatusBanner.getLoggingIdentifier();
        if (loggingIdentifier == null) {
            loggingIdentifier = "";
        }
        return new Component(componentType, loggingIdentifier, null, 4, null);
    }

    public static final Context getEventContext(IacStatusBanner iacStatusBanner) {
        Intrinsics.checkNotNullParameter(iacStatusBanner, "<this>");
        String string2 = iacStatusBanner.getReceiptUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new InAppComm(string2, null, iacStatusBanner.getTitle().getText(), null, null, null, null, null, 250, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554433, -1, -1, -1, -1, -1, 16383, null);
    }
}
