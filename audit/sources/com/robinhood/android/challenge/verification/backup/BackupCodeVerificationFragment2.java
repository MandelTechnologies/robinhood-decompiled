package com.robinhood.android.challenge.verification.backup;

import android.view.View;
import com.robinhood.android.challenge.databinding.FragmentBackupCodeVerificationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackupCodeVerificationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class BackupCodeVerificationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentBackupCodeVerificationBinding> {
    public static final BackupCodeVerificationFragment2 INSTANCE = new BackupCodeVerificationFragment2();

    BackupCodeVerificationFragment2() {
        super(1, FragmentBackupCodeVerificationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/challenge/databinding/FragmentBackupCodeVerificationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentBackupCodeVerificationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentBackupCodeVerificationBinding.bind(p0);
    }
}
