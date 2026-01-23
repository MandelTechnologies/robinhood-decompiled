package com.robinhood.experiments;

import com.robinhood.enums.RhEnum;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceIdExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\u0018\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/experiments/DeviceIdExperiment;", "VariantT", "", "Lcom/robinhood/enums/RhEnum;", "Lcom/robinhood/experiments/ExperimentDeclaration;", "serverName", "", "obfuscatedName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public abstract class DeviceIdExperiment<VariantT extends Enum<VariantT> & RhEnum<VariantT>> extends ExperimentDeclaration<VariantT> {
    public /* synthetic */ DeviceIdExperiment(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceIdExperiment(String serverName, String str) {
        super(serverName, str, null);
        Intrinsics.checkNotNullParameter(serverName, "serverName");
    }
}
