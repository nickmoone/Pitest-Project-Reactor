package org.pitest.mutationtest.engine.gregor;

import org.pitest.mutationtest.engine.MutationIdentifier;
import org.pitest.mutationtest.engine.gregor.blocks.BlockCounter;

public interface MutationContext extends BlockCounter {

  void registerCurrentLine(int line);

  ClassInfo getClassInfo();

  MutationIdentifier registerMutation(MethodMutatorFactory factory,
      String description);

  void registerMutation(MutationIdentifier id, String description);

  boolean shouldMutate(MutationIdentifier newId);

}