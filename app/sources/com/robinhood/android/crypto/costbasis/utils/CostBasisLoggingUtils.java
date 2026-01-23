package com.robinhood.android.crypto.costbasis.utils;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CostBasisLoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"updateComponent", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "identifier", "", "feature-crypto-cost-basis_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.costbasis.utils.CostBasisLoggingUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CostBasisLoggingUtils {
    public static /* synthetic */ UserInteractionEventDescriptor updateComponent$default(UserInteractionEventDescriptor userInteractionEventDescriptor, Component.ComponentType componentType, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return updateComponent(userInteractionEventDescriptor, componentType, str);
    }

    public static final UserInteractionEventDescriptor updateComponent(UserInteractionEventDescriptor userInteractionEventDescriptor, Component.ComponentType componentType, String identifier) {
        Intrinsics.checkNotNullParameter(userInteractionEventDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, identifier, null, 4, null), null, 47, null));
    }
}
