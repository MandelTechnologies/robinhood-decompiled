package com.robinhood.experiments;

import com.robinhood.enums.RhEnum;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProcessInvariantExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000*\u0018\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001\nB\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/experiments/ProcessInvariantExperiment;", "VariantT", "", "Lcom/robinhood/enums/RhEnum;", "Lcom/robinhood/experiments/ExperimentDeclaration;", "serverName", "", "obfuscatedName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "SPECTO", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public abstract class ProcessInvariantExperiment<VariantT extends Enum<VariantT> & RhEnum<VariantT>> extends ExperimentDeclaration<VariantT> {
    public /* synthetic */ ProcessInvariantExperiment(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessInvariantExperiment(String serverName, String str) {
        super(serverName, str, null);
        Intrinsics.checkNotNullParameter(serverName, "serverName");
    }

    /* compiled from: ProcessInvariantExperiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/ProcessInvariantExperiment$SPECTO;", "Lcom/robinhood/experiments/ProcessInvariantExperiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SPECTO extends ProcessInvariantExperiment<SimpleVariant> {
        public static final SPECTO INSTANCE = new SPECTO();

        /* JADX WARN: Multi-variable type inference failed */
        private SPECTO() {
            super("android-specto", null, 2, 0 == true ? 1 : 0);
        }
    }
}
