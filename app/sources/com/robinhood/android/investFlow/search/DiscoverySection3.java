package com.robinhood.android.investFlow.search;

import java.util.UUID;
import kotlin.Metadata;

/* compiled from: DiscoverySection.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/UnknownComponentTypeException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "listId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.search.UnknownComponentTypeException, reason: use source file name */
/* loaded from: classes10.dex */
public final class DiscoverySection3 extends IllegalStateException {
    public static final int $stable = 8;

    public DiscoverySection3(UUID uuid) {
        super("Unknown component type in invest flow discovery with list id " + uuid);
    }
}
