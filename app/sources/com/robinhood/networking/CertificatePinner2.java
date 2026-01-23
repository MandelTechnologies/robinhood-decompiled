package com.robinhood.networking;

import com.robinhood.networking.util.OkHttpClients;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.CertificatePinner;
import timber.log.Timber;

/* compiled from: CertificatePinner.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"certificatePinner", "Lokhttp3/CertificatePinner;", "enable", "", "lib-networking_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.networking.CertificatePinnerKt, reason: use source file name */
/* loaded from: classes22.dex */
public final class CertificatePinner2 {
    public static final CertificatePinner certificatePinner(boolean z) {
        CertificatePinner.Builder builder = new CertificatePinner.Builder();
        if (!z) {
            Timber.INSTANCE.mo3362w("Certificate pinning is *disabled*", new Object[0]);
        } else {
            Timber.INSTANCE.mo3350d("Certificate pinning is *enabled*", new Object[0]);
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"sha256/++MBgDH5WGvL9Bcn5Be30cRcL0f5O+NyoXuWtQdX1aI=", "sha256/f0KW/FtqTjs108NpYj42SrGvOB2PpxIVM8nWxjPqJGE=", "sha256/NqvDJlas/GRcYbcWE8S/IceH9cq77kg0jVhZeAPXq8k=", "sha256/9+ze1cZgR9KO1kZrVDxA4HQ6voHRCSVNz4RdTCx4U8U=", "sha256/KwccWaCgrnaw6tsrrSO61FgLacNgG2MMLq8GE6+oP5I="});
            List listPlus = CollectionsKt.plus((Collection) CollectionsKt.listOf((Object[]) new String[]{"sha256/TIMjrOG2mWCLSclvIWf7cp1oftc0Lkd1R3pL3JGBU3o=", "sha256/5kJvNEMw0KjrCAu7eXY5HZdvyCS13BbA0VJG1RSP91w=", "sha256/r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E="}), (Iterable) listListOf);
            for (Map.Entry entry : MapsKt.mapOf(Tuples4.m3642to("api.robinhood.com", CollectionsKt.plus((Collection) CollectionsKt.listOf((Object[]) new String[]{"sha256/PMnXyJi2nFTYkJiibZYXjOAqB9dna+Kj+jhPlFV8qCY=", "sha256/RRM1dGqnDFsCJXBTHky16vi1obOlCgFFn/yOhI/y+ho=", "sha256/WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18="}), (Iterable) listListOf)), Tuples4.m3642to("bonfire.robinhood.com", listPlus), Tuples4.m3642to("cashier.robinhood.com", listPlus), Tuples4.m3642to("crumbs.robinhood.com", listPlus), Tuples4.m3642to("nummus.robinhood.com", CollectionsKt.plus((Collection) CollectionsKt.listOf((Object[]) new String[]{"sha256/lfLI/J7jjJrjfbwLJEnpVWN2gMkpGsl6GwDbd21U4PU=", "sha256/5kJvNEMw0KjrCAu7eXY5HZdvyCS13BbA0VJG1RSP91w=", "sha256/r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E="}), (Iterable) listListOf)), Tuples4.m3642to("minerva.robinhood.com", listPlus), Tuples4.m3642to("midlands.robinhood.com", listPlus), Tuples4.m3642to("atlas.robinhood.com", listPlus), Tuples4.m3642to("dora.robinhood.com", listPlus), Tuples4.m3642to("identi.robinhood.com", listPlus)).entrySet()) {
                OkHttpClients.add(builder, (String) entry.getKey(), (List) entry.getValue());
            }
        }
        return builder.build();
    }
}
