package com.robinhood.android.deeplink;

import android.content.Intent;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoDeeplinkCreator;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: DeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020)H\u0016¢\u0006\u0002\u0010*J#\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010+\u001a\u00028\u00002\u0006\u0010(\u001a\u00020)H&¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u001bH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\r\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "D", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/android/deeplink/DeeplinkTarget;", "dtoDeeplinkCreator", "Lcom/robinhood/idl/DtoDeeplinkCreator;", "experiment", "Lcom/robinhood/experiments/ExperimentDeclaration;", "isLongRunning", "", "regionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "shouldClearTop", "<init>", "(Lcom/robinhood/idl/DtoDeeplinkCreator;Lcom/robinhood/experiments/ExperimentDeclaration;ZLjava/util/Set;Z)V", "getDtoDeeplinkCreator", "()Lcom/robinhood/idl/DtoDeeplinkCreator;", "getExperiment", "()Lcom/robinhood/experiments/ExperimentDeclaration;", "()Z", "getRegionGates", "()Ljava/util/Set;", "getShouldClearTop", "deprecated", "getDeprecated", "path", "", "getPath", "()Ljava/lang/String;", "requireAuthentication", "getRequireAuthentication", "supportedAppTypes", "", "Lcom/robinhood/shared/app/type/AppType;", "getSupportedAppTypes", "()Ljava/util/List;", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "(Lcom/robinhood/idl/MessageDto;Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "toString", "lib-deeplink_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.IdlDeeplinkTarget, reason: use source file name */
/* loaded from: classes2.dex */
public abstract class DeeplinkTarget3<D extends Dto3<?>> implements DeeplinkTarget {
    private final DtoDeeplinkCreator<D> dtoDeeplinkCreator;
    private final ExperimentDeclaration<?> experiment;
    private final boolean isLongRunning;
    private final Set<RegionGate> regionGates;
    private final boolean shouldClearTop;

    public abstract Intent[] getIntents(D data, DeeplinkTarget2 deeplinkContext);

    /* JADX WARN: Multi-variable type inference failed */
    public DeeplinkTarget3(DtoDeeplinkCreator<D> dtoDeeplinkCreator, ExperimentDeclaration<?> experimentDeclaration, boolean z, Set<? extends RegionGate> set, boolean z2) {
        Intrinsics.checkNotNullParameter(dtoDeeplinkCreator, "dtoDeeplinkCreator");
        this.dtoDeeplinkCreator = dtoDeeplinkCreator;
        this.experiment = experimentDeclaration;
        this.isLongRunning = z;
        this.regionGates = set;
        this.shouldClearTop = z2;
        if (getExperiment() != null && !getIsLongRunning()) {
            throw new IllegalStateException("DeepLinks specifying an experiment must pass true for isLongRunning - use one of the public constructors instead of copy.");
        }
        Set<RegionGate> regionGates = getRegionGates();
        if (regionGates != null && !regionGates.isEmpty() && !getIsLongRunning()) {
            throw new IllegalStateException("DeepLinks specifying a region gate must pass true for isLongRunning - use one of the public constructors instead of copy.");
        }
    }

    public /* synthetic */ DeeplinkTarget3(DtoDeeplinkCreator dtoDeeplinkCreator, ExperimentDeclaration experimentDeclaration, boolean z, Set set, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dtoDeeplinkCreator, (i & 2) != 0 ? null : experimentDeclaration, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : set, (i & 16) != 0 ? false : z2);
    }

    public final DtoDeeplinkCreator<D> getDtoDeeplinkCreator() {
        return this.dtoDeeplinkCreator;
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public ExperimentDeclaration<?> getExperiment() {
        return this.experiment;
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    /* renamed from: isLongRunning, reason: from getter */
    public boolean getIsLongRunning() {
        return this.isLongRunning;
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Set<RegionGate> getRegionGates() {
        return this.regionGates;
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public boolean getShouldClearTop() {
        return this.shouldClearTop;
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public boolean getDeprecated() {
        return this.dtoDeeplinkCreator.getDeeplinkDeprecated();
    }

    @Override // com.robinhood.android.deeplink.BaseDeepLinkPath
    public String getPath() {
        return this.dtoDeeplinkCreator.getDeeplinkRoute();
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public boolean getRequireAuthentication() {
        return this.dtoDeeplinkCreator.getDeeplinkRequireAuthentication();
    }

    public final List<AppType> getSupportedAppTypes() {
        return this.dtoDeeplinkCreator.getDeeplinkSupportedAppTypes();
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        return getIntents(this.dtoDeeplinkCreator.decodeFromUri(deeplinkContext.getUri()), deeplinkContext);
    }

    public String toString() {
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = Reflection.getOrCreateKotlinClass(getClass()).toString();
        }
        return simpleName + "(path = \"" + getPath() + "\")";
    }
}
