package com.robinhood.idl;

import com.robinhood.idl.http.Urls;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.targetbackend.TargetBackend;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: BackendServices.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, m3636d2 = {"getUrl", "Lokhttp3/HttpUrl;", "Lcom/robinhood/targetbackend/TargetBackend;", "options", "Lcom/robinhood/idl/IDLServiceBackendOptionsDto;", "Lcom/robinhood/idl/IDLServiceOptionsDto;", "backends", "Lcom/robinhood/idl/BackendsDto;", "path", "", "getBaseUrl", "Lcom/robinhood/targetbackend/Endpoint;", "dto", "Lcom/robinhood/idl/ApolloEndpointDto;", "Lcom/robinhood/idl/DockerEndpointDto;", "idl.api.v1_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.idl.BackendServicesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BackendServices {

    /* compiled from: BackendServices.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.idl.BackendServicesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TargetBackend.EnumC41639Id.values().length];
            try {
                iArr[TargetBackend.EnumC41639Id.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.NAMESPACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.UAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.STAGING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.EXTERNAL_TEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.EXTERNAL_DEGRADED_TEST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.CUSTOM_HOSTNAME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final HttpUrl getUrl(TargetBackend targetBackend, IDLServiceBackendOptionsDto options) {
        Intrinsics.checkNotNullParameter(targetBackend, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return getUrl(targetBackend, options.getService().getBackends(), options.getPath());
    }

    public static final HttpUrl getUrl(TargetBackend targetBackend, IDLServiceOptionsDto options) {
        Intrinsics.checkNotNullParameter(targetBackend, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        IDLServiceBackendOptionsDto backend = options.getBackend();
        if (backend != null) {
            return getUrl(targetBackend, backend);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final HttpUrl getUrl(TargetBackend targetBackend, BackendsDto backends, String path) {
        Intrinsics.checkNotNullParameter(targetBackend, "<this>");
        Intrinsics.checkNotNullParameter(backends, "backends");
        Intrinsics.checkNotNullParameter(path, "path");
        return Urls.requireTrailingResolve(getBaseUrl(targetBackend, backends), path);
    }

    public static final HttpUrl getBaseUrl(TargetBackend targetBackend, BackendsDto backends) {
        String url;
        HttpUrl httpUrl;
        Intrinsics.checkNotNullParameter(targetBackend, "<this>");
        Intrinsics.checkNotNullParameter(backends, "backends");
        switch (WhenMappings.$EnumSwitchMapping$0[targetBackend.getId().ordinal()]) {
            case 1:
                FixedEndpointDto production = backends.getProduction();
                if (production == null || (url = production.getUrl()) == null || (httpUrl = HttpUrl.INSTANCE.get(url)) == null) {
                    throw new IllegalStateException("Production URL not present");
                }
                return httpUrl;
            case 2:
            case 3:
                Endpoint endpoint = targetBackend.getEndpoint();
                ApolloEndpointDto apollo = backends.getApollo();
                if (apollo != null) {
                    return getBaseUrl(endpoint, apollo);
                }
                throw new IllegalStateException("Required value was null.");
            case 4:
            case 5:
            case 6:
            case 7:
                Endpoint endpoint2 = targetBackend.getEndpoint();
                DockerEndpointDto docker = backends.getDocker();
                if (docker != null) {
                    return getBaseUrl(endpoint2, docker);
                }
                throw new IllegalStateException("Required value was null.");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final HttpUrl getBaseUrl(Endpoint endpoint, ApolloEndpointDto apolloEndpointDto) {
        String apolloNamespace = endpoint.getApolloNamespace();
        if (apolloNamespace == null) {
            throw new IllegalStateException("Apollo namespace not present");
        }
        return Urls.requireTrailingResolve(HttpUrl.INSTANCE.get("https://" + apolloEndpointDto.getHost_prefix() + "--" + apolloNamespace + ".apollo.rhinternal.net"), apolloEndpointDto.getPath());
    }

    private static final HttpUrl getBaseUrl(Endpoint endpoint, DockerEndpointDto dockerEndpointDto) {
        return Urls.requireTrailingResolve(endpoint.getBrokebackUrl(), dockerEndpointDto.getPath());
    }
}
