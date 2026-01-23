package com.robinhood.librobinhood.data.store;

import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import com.robinhood.librobinhood.data.store.FeatureLock;
import com.robinhood.models.api.AccountType;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureLockBuilder.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a#\u0010\t\u001a\u00020\u0005*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a#\u0010\n\u001a\u00020\u0005*\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\r¢\u0006\u0002\u0010\u000e\u001a#\u0010\u000f\u001a\u00020\u0005*\u00020\u00042\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011¢\u0006\u0002\u0010\u0012\u001a2\u0010\u0013\u001a\u00020\u0005\"\u0018\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u0015*\b\u0012\u0004\u0012\u0002H\u00140\u0016*\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017\u001a'\u0010\u0018\u001a\u00020\u0005*\u00020\u00042\u0016\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\f\"\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001b\u001a\u0012\u0010\u001c\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d\u001a#\u0010\u001e\u001a\u00020\u0005*\u00020\u00042\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\f\"\u00020\u001f¢\u0006\u0002\u0010 \u001a\n\u0010!\u001a\u00020\u0005*\u00020\u0004\u001a\n\u0010\"\u001a\u00020\u0005*\u00020\u0004¨\u0006#"}, m3636d2 = {"andLock", "Lcom/robinhood/librobinhood/data/store/FeatureLock;", "block", "Lkotlin/Function1;", "Lcom/robinhood/librobinhood/data/store/FeatureLockBuilder;", "", "Lkotlin/ExtensionFunctionType;", "orLock", "and", "or", "managementType", "managementTypes", "", "Lcom/robinhood/models/api/ManagementType;", "(Lcom/robinhood/librobinhood/data/store/FeatureLockBuilder;[Lcom/robinhood/models/api/ManagementType;)V", "brokerageAccountType", "accountTypes", "Lcom/robinhood/models/api/BrokerageAccountType;", "(Lcom/robinhood/librobinhood/data/store/FeatureLockBuilder;[Lcom/robinhood/models/api/BrokerageAccountType;)V", "experiment", "V", "Lcom/robinhood/enums/RhEnum;", "", "Lcom/robinhood/experiments/Experiment;", "optionLevel", "optionLevels", "", "(Lcom/robinhood/librobinhood/data/store/FeatureLockBuilder;[Ljava/lang/String;)V", "regionGate", "Lcom/robinhood/android/regiongate/RegionGate;", "accountType", "Lcom/robinhood/models/api/AccountType;", "(Lcom/robinhood/librobinhood/data/store/FeatureLockBuilder;[Lcom/robinhood/models/api/AccountType;)V", "isOriginalAccount", "marginAccountType", "lib-store-account-access_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.FeatureLockBuilderKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class FeatureLockBuilder2 {
    public static final FeatureLock andLock(Function1<? super FeatureLockBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        FeatureLockBuilder featureLockBuilder = new FeatureLockBuilder();
        block.invoke(featureLockBuilder);
        return featureLockBuilder.buildAnd();
    }

    public static final FeatureLock orLock(Function1<? super FeatureLockBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        FeatureLockBuilder featureLockBuilder = new FeatureLockBuilder();
        block.invoke(featureLockBuilder);
        return featureLockBuilder.buildOr();
    }

    public static final void and(FeatureLockBuilder featureLockBuilder, Function1<? super FeatureLockBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(featureLockBuilder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        featureLockBuilder.addLock(andLock(block));
    }

    /* renamed from: or */
    public static final void m2609or(FeatureLockBuilder featureLockBuilder, Function1<? super FeatureLockBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(featureLockBuilder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        featureLockBuilder.addLock(orLock(block));
    }

    public static final void managementType(FeatureLockBuilder featureLockBuilder, ManagementType... managementTypes) {
        Intrinsics.checkNotNullParameter(featureLockBuilder, "<this>");
        Intrinsics.checkNotNullParameter(managementTypes, "managementTypes");
        featureLockBuilder.addLock(new FeatureLock.ManagementTypes(ArraysKt.toList(managementTypes)));
    }

    public static final void brokerageAccountType(FeatureLockBuilder featureLockBuilder, BrokerageAccountType... accountTypes) {
        Intrinsics.checkNotNullParameter(featureLockBuilder, "<this>");
        Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
        featureLockBuilder.addLock(new FeatureLock.BrokerageAccountTypes(ArraysKt.toList(accountTypes)));
    }

    public static final <V extends Enum<V> & RhEnum<V>> void experiment(FeatureLockBuilder featureLockBuilder, Experiment<V> experiment) {
        Intrinsics.checkNotNullParameter(featureLockBuilder, "<this>");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        featureLockBuilder.addLock(new FeatureLock.ExperimentLock(experiment));
    }

    public static final void optionLevel(FeatureLockBuilder featureLockBuilder, String... optionLevels) {
        Intrinsics.checkNotNullParameter(featureLockBuilder, "<this>");
        Intrinsics.checkNotNullParameter(optionLevels, "optionLevels");
        featureLockBuilder.addLock(new FeatureLock.OptionLevel(ArraysKt.toList(optionLevels)));
    }

    public static final void regionGate(FeatureLockBuilder featureLockBuilder, RegionGate regionGate) {
        Intrinsics.checkNotNullParameter(featureLockBuilder, "<this>");
        Intrinsics.checkNotNullParameter(regionGate, "regionGate");
        featureLockBuilder.addLock(new FeatureLock.Region(regionGate));
    }

    public static final void accountType(FeatureLockBuilder featureLockBuilder, AccountType... accountTypes) {
        Intrinsics.checkNotNullParameter(featureLockBuilder, "<this>");
        Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
        featureLockBuilder.addLock(new FeatureLock.AccountTypes(ArraysKt.toList(accountTypes)));
    }

    public static final void isOriginalAccount(FeatureLockBuilder featureLockBuilder) {
        Intrinsics.checkNotNullParameter(featureLockBuilder, "<this>");
        featureLockBuilder.addLock(FeatureLock.OriginalAccount.INSTANCE);
    }

    public static final void marginAccountType(FeatureLockBuilder featureLockBuilder) {
        Intrinsics.checkNotNullParameter(featureLockBuilder, "<this>");
        and(featureLockBuilder, new Function1() { // from class: com.robinhood.librobinhood.data.store.FeatureLockBuilderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureLockBuilder2.marginAccountType$lambda$0((FeatureLockBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit marginAccountType$lambda$0(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        brokerageAccountType(and, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
        managementType(and, ManagementType.SELF_DIRECTED);
        return Unit.INSTANCE;
    }
}
