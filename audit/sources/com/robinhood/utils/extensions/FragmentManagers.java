package com.robinhood.utils.extensions;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentManagers.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/utils/extensions/FragmentLifecycleEvent;", "", "<init>", "()V", "Resumed", "Lcom/robinhood/utils/extensions/FragmentLifecycleEvent$Resumed;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.FragmentLifecycleEvent, reason: use source file name */
/* loaded from: classes12.dex */
public abstract class FragmentManagers {
    public /* synthetic */ FragmentManagers(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: FragmentManagers.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/utils/extensions/FragmentLifecycleEvent$Resumed;", "Lcom/robinhood/utils/extensions/FragmentLifecycleEvent;", "fragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.utils.extensions.FragmentLifecycleEvent$Resumed */
    public static final class Resumed extends FragmentManagers {
        private final Fragment fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Resumed(Fragment fragment) {
            super(null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.fragment = fragment;
        }

        public final Fragment getFragment() {
            return this.fragment;
        }
    }

    private FragmentManagers() {
    }
}
