package com.plaid.link;

import com.plaid.link.configuration.LinkTokenConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"linkTokenConfiguration", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "initializer", "Lkotlin/Function1;", "Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "", "Lkotlin/ExtensionFunctionType;", "link-sdk_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class PlaidKotlinFunctionsKt {
    public static final /* synthetic */ LinkTokenConfiguration linkTokenConfiguration(Function1 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        LinkTokenConfiguration.Builder builder = new LinkTokenConfiguration.Builder();
        initializer.invoke(builder);
        return builder.build();
    }
}
