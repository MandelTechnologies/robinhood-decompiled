package com.plaid.internal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.plaid.internal.classic.networking.adapter.AccountSubtypeAdapter;
import com.plaid.internal.classic.networking.adapter.AccountTypeAdapter;
import com.plaid.internal.classic.networking.adapter.LinkAccountVerificationStatusAdapter;
import com.plaid.internal.classic.networking.adapter.LinkEventNameAdapter;
import com.plaid.internal.classic.networking.adapter.LinkEventViewNameAdapter;
import com.plaid.internal.classic.networking.adapter.LinkExitMetadataStatusAdapter;
import com.plaid.internal.classic.networking.adapter.PlaidErrorCodeAdapter;
import com.plaid.internal.classic.networking.adapter.PlaidErrorTypeAdapter;
import com.plaid.link.event.LinkEventName;
import com.plaid.link.event.LinkEventViewName;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountType;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkErrorType;
import com.plaid.link.result.LinkExitMetadataStatus;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.p5 */
/* loaded from: classes16.dex */
public final class C7179p5 implements Factory<Gson> {

    /* renamed from: a */
    public final C7117j5 f3112a;

    public C7179p5(C7117j5 c7117j5) {
        this.f3112a = c7117j5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f3112a.getClass();
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LinkEventViewName.class, new LinkEventViewNameAdapter());
        gsonBuilder.registerTypeAdapter(LinkEventName.class, new LinkEventNameAdapter());
        gsonBuilder.registerTypeAdapter(LinkAccountType.class, new AccountTypeAdapter());
        gsonBuilder.registerTypeAdapter(LinkAccountSubtype.class, new AccountSubtypeAdapter());
        gsonBuilder.registerTypeAdapter(LinkErrorCode.class, new PlaidErrorCodeAdapter());
        gsonBuilder.registerTypeAdapter(LinkErrorType.class, new PlaidErrorTypeAdapter());
        gsonBuilder.registerTypeAdapter(LinkAccountVerificationStatus.class, new LinkAccountVerificationStatusAdapter());
        gsonBuilder.registerTypeAdapter(LinkExitMetadataStatus.class, new LinkExitMetadataStatusAdapter());
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        return (Gson) Preconditions.checkNotNullFromProvides(gsonCreate);
    }
}
